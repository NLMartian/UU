/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

/**
 *
 * @author 甲骨文
 */
public interface FeedManager {
    /**
     * 添加一条新鲜事
     * @param uid 用户uid
     * @param feedSrcId 新鲜事id
     * @param feedType 新鲜事类型
     * @return 新鲜事id
     * @throws Exception 
     */
    long addFeed(long uid, long feedSrcId, String feedType)
            throws Exception;
    
}
