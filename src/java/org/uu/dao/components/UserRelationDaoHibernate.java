/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
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
        
        Userrelation userrelation1 = new Userrelation();
        userrelation1.setUid2(user2);
        userrelation1.setUserinfo(getHibernateTemplate().get(Userinfo.class, user1));
        
        Userrelation userrelation2 = new Userrelation();
        userrelation2.setUid2(user1);
        userrelation2.setUserinfo(getHibernateTemplate().get(Userinfo.class, user2));
                
        this.getHibernateTemplate().save(userrelation1);
        this.getHibernateTemplate().save(userrelation2);
    }

    /**
     * 删除好友关系
     * @param user1
     * @param user2 
     */
    @Override
    public void deleteRelation(long user1, long user2) {
        
        Userrelation userrelation1 = new Userrelation();
        userrelation1.setUid2(user2);
        userrelation1.setUserinfo(getHibernateTemplate().get(Userinfo.class, user1));
        
        Userrelation userrelation2 = new Userrelation();
        userrelation2.setUid2(user1);
        userrelation2.setUserinfo(getHibernateTemplate().get(Userinfo.class, user2));
        
        getHibernateTemplate().delete(userrelation2);
        getHibernateTemplate().delete(userrelation1);
    }

    /**
     * 检查关系是否存在
     * @param user1
     * @param user2
     * @return 
     */
    @Override
    public boolean ifExist(long user1, long user2) {
       
        Object[] o1 = {user1, getHibernateTemplate().get(Userinfo.class, user2)};
        Object[] o2 = {user2, getHibernateTemplate().get(Userinfo.class, user1)};
        
        List list1 = getHibernateTemplate().find("from Userrelation a  where a.uid2=?  and a.userinfo=? ",o1);
        List list2 = getHibernateTemplate().find("from Userrelation a  where a.uid2=?  and a.userinfo=? ",o2);
        
        if(list1.size() == 0 && list2.size() == 0) {
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
        
        List<Userinfo> list = 
                getHibernateTemplate().find("from Userrelation a  where a.uid2=?",userid);
        
        return list;
    }
    
}
