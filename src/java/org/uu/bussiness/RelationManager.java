/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.List;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public interface RelationManager {
    
    /**
     * 添加好友关系
     * @param uid1
     * @param uid2
     * @throws Exception 
     */
    void addRelation(long uid1, long uid2)
            throws Exception;
    
    /**
     * 删除好友关系
     * @param uid1
     * @param uid2
     * @throws Exception 
     */
    void deleteRelation(long uid1, long uid2)
            throws Exception;
    
    /**
     * 查找关系是否存在
     * @param uid1
     * @param uid2
     * @return
     * @throws Exception 
     */
    boolean ifExist(long uid1, long uid2)
            throws Exception;
    
    /**
     * 获取好友列表
     * @param uid
     * @return
     * @throws Exception 
     */
    List<Userinfo> getFriendList(long uid)
            throws Exception;
    
    /**
     * 获取好友分页列表
     */
    List<Userinfo> getPageFriendList(long uid, int start, int length)
            throws Exception;
}
