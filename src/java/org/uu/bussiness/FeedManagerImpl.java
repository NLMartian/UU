/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.List;
import org.uu.dao.components.FeedDao;
import org.uu.dao.components.StatusDao;
import org.uu.dao.components.UserDao;
import org.uu.dao.model.Feed;
import org.uu.dao.model.Status;

/**
 *
 * @author 甲骨文
 */
public class FeedManagerImpl implements FeedManager{

    private FeedDao feedDao;
    private UserDao userDao;
    private StatusDao statusDao;

    public void setFeedDao(FeedDao feedDao) {
        this.feedDao = feedDao;
    }

    public void setStatusDao(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    /**
     * 添加一条新鲜事
     * @param uid
     * @param feedSrcId
     * @param feedType 状态为STATUS， 日志为BLOG
     * @return 新鲜事id
     * @throws Exception 
     */
    @Override
    public long addFeed(long uid, long feedSrcId, String feedType) throws Exception {
        try {
            Feed feed = new Feed();
            feed.setUserinfo(userDao.getUser(uid));
            feed.setFeedType(feedType);
            feed.setFeedSrcid(feedSrcId);
            
            if(feedType.equals("STATUS")) {
                Status status = statusDao.getStatusByid(feedSrcId);
                feed.setTitle(status.getStatusMessage());
                feed.setUpdateTime(status.getTime());
                feed.setDescription("");
            }
            else if(feedType.equals("BLOG")) {
                
            }
            
            feedDao.addFeed(feed);
            return feed.getFeedId();
            
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("新增新鲜事时出错");
        }
    }

    @Override
    public List<Feed> getOnesAllFeeds(long uid) throws Exception {
        try {
            return feedDao.getAllFeedByUid(uid);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("获取用户新鲜事时出错");
        }
    }
    
}