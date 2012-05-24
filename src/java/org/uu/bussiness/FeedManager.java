/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.List;
import org.uu.dao.model.Feed;

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
    
    /**
     * 查找一个用户所有的新鲜事
     * @param uid
     * @return 用户新新鲜事列表
     * @throws Exception 
     */
    List<Feed> getOnesAllFeeds(long uid)
            throws Exception;
    
    /**
     * 获取分页
     * @param uid 用户id
     * @param start 开始索引号
     * @param length 长度
     * @return 分页新鲜事列表
     */
    List<Feed> getPageFeed(long uid, int start, int length)
            throws Exception;
    
}
