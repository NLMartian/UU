/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.uu.dao.model.Userinfo;
import org.uu.dao.model.Userrelation;

/**
 *
 * @author 甲骨文
 */
public class UserRelationDaoHibernate extends HibernateDaoSupport implements UserRelationDao{

    /**
     * 添加好友关系
     * @param user1
     * @param user2 
     */
    @Override
    public void addRelation(long user1, long user2) {
        
        Userrelation userrelation1 = new Userrelation(user1, user2);
        this.getHibernateTemplate().save(userrelation1);
        
        Userrelation userrelation2 = new Userrelation(user2, user1);
        this.getHibernateTemplate().save(userrelation2);
    }

    /**
     * 删除好友关系
     * @param user1
     * @param user2 
     */
    @Override
    public void deleteRelation(long user1, long user2) {
        
        Userrelation userrelation1 = new Userrelation(user1, user2);
        getHibernateTemplate().delete(userrelation1);
 
        Userrelation userrelation2 = new Userrelation(user2, user1);
        getHibernateTemplate().delete(userrelation2);
    }

    /**
     * 检查关系是否存在
     * @param user1
     * @param user2
     * @return 
     */
    @Override
    public boolean ifExist(long user1, long user2) {
       
        Object[] o1 = {user1, user2};
        Object[] o2 = {user2, user1};
        
        List list1 = getHibernateTemplate().find("from Userrelation a  where a.uid1=? and a.uid2=?",o1);
        List list2 = getHibernateTemplate().find("from Userrelation a  where a.uid1=? and a.uid2=?",o2);
        
        if(list1.isEmpty() && list2.isEmpty()) {
            return false;
        }
       
        return true;
    }

    /**
     * 获取好友列表
     * @param userid
     * @return 
     */
    @Override
    public List<Userinfo> findAllFriend(long userid) {
        
        List<Userrelation> relationList = 
                getHibernateTemplate().find("from Userrelation a  where a.uid1=?",userid);
        
        if(relationList == null || relationList.isEmpty()) {
            return null;
        }
        
        List<Userinfo> userList = new ArrayList<Userinfo>();
        
        for(int i = 0; i < relationList.size(); i ++) {
            userList.add(getHibernateTemplate()
                    .get(Userinfo.class, relationList.get(i).getUid2()));
        }
        
        return userList;
    }

    
}
