/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
import org.uu.dao.model.Feed;

/**
 *
 * @author 甲骨文
 */
public interface FeedDao {
    
    /**
     * 添加新鲜事
     * @param feed 要添加的新鲜事
     */
    void addFeed(Feed feed);
    
    
    /**
     *  通过id得到一条新鲜事
     * @param feedId 新鲜事id
     * @return 找到的新鲜事
     */
    Feed getFeedById(long feedId);
    
    /**
     * 得到用户所有的
     * @param uid 用户的id
     * @return 新鲜事列表
     */
    List<Feed> getAllFeedByUid(long uid);
    
    /**
     * 获取分页新鲜事
     * @param uid 用户id
     * @param start 开始的索引号 
     * @param length 分页的长度
     * @return  分页新鲜事列表
     */
    List<Feed> getPageFeed(final long uid, final int start, final int length);
    
}
