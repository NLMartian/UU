/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.FeedManager;
import org.uu.dao.model.Feed;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class GetPagedFeeds extends BaseAction{
    private int start;
    private int length;
    
    private List<Feed> feedList;
    private int allLength;
    
    private FeedManager feedMgr;

    public int getAllLength() {
        return allLength;
    }

    public void setAllLength(int allLength) {
        this.allLength = allLength;
    }

    
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<Feed> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<Feed> feedList) {
        this.feedList = feedList;
    }

    public void setFeedMgr(FeedManager feedMgr) {
        this.feedMgr = feedMgr;
    }


    public String execute() {
        
        Map session = ActionContext.getContext().getSession();
        Userinfo user = (Userinfo)session.get("CurrUser");
        
        try {
            feedList = (ArrayList<Feed>)feedMgr.getPageFeed(user.getUid(), start, length);
            
            // 如果是从开始查询则计算一下总的新鲜事数量
//            if(start == 0) {
//                allLength = feedMgr.getOnesAllFeeds(user.getUid()).size();
//            }
        } catch (Exception ex) {
            Logger.getLogger(GetPagedFeeds.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SUCCESS;
    }
}
