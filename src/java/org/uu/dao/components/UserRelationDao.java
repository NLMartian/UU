/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
import org.uu.dao.model.Userinfo;
/**
 *
 * @author 甲骨文
 */
public interface UserRelationDao {
    
    /**
     * 添加一个好友关系
     * @param user1 用户1uid
     * @param user2 用户2uid
     * 
     */
    void addRelation(long user1, long user2);
    
    
    /*
     * 删除一个好友关系
     */
    void deleteRelation(long user1, long user2);
    
    /**
     * 查看好友关系时候存在
     * @param user1
     * @param user2
     * @return 
     */
    boolean ifExist(long user1, long user2);
    
    /**
     * 查找某人的所有好友
     * @param userid 用户uid
     * @return 用户好友列表
     */
    List<Userinfo> findAllFriend(long userid);
}
