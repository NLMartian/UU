/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.ArrayList;
import java.util.List;
import org.uu.dao.components.UserDao;
import org.uu.dao.components.UserRelationDao;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class RelationManagerImpl implements RelationManager{

    private UserDao userDao;
    private UserRelationDao relationDao;

    public void setRelationDao(UserRelationDao relationDao) {
        this.relationDao = relationDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    
    
    @Override
    public void addRelation(long uid1, long uid2) throws Exception {
        try {
            relationDao.addRelation(uid1, uid2);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("新增用户关系出错！");
        }
    }

    @Override
    public void deleteRelation(long uid1, long uid2) throws Exception {
        try {
            relationDao.deleteRelation(uid1, uid2);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("删除用户关系出错！");
        }
    }

    @Override
    public boolean ifExist(long uid1, long uid2) throws Exception {
       try {
            return relationDao.ifExist(uid1, uid2);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("查找用户关系是否存在时出错！");
        }
    }

    @Override
    public List<Userinfo> getFriendList(long uid) throws Exception {
       try {
            return (ArrayList<Userinfo>)relationDao.findAllFriend(uid);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("获取好友列表时出错！");
        }
    }

    @Override
    public List<Userinfo> getPageFriendList(long uid, int start, int length) throws Exception {
        List<Userinfo> allFriendList = (ArrayList<Userinfo>)getFriendList(uid);
        if(allFriendList == null || allFriendList.isEmpty()) {
            return null;
        }
        
        List<Userinfo> pageFriendList = new  ArrayList<Userinfo>();
        
        int pageLength = length;
        if(start + pageLength > allFriendList.size()) {
            pageLength = allFriendList.size() - start;
        }
        for(int i = start; i < start + pageLength; i ++) {
            pageFriendList.add(allFriendList.get(i));
        }
        
        return pageFriendList;
    }
    
}
