/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.RelationManager;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class GetFriend extends BaseAction{
    private long uid;
    private int start;
    private int length;
    
    //  返回参数: 好友数量
    private int count;
    
    private ArrayList<Userinfo> pageList;
            
            
    private RelationManager relationMgr;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<Userinfo> getPageList() {
        return pageList;
    }

    public void setPageList(ArrayList<Userinfo> pageList) {
        this.pageList = pageList;
    }

    
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setRelationMgr(RelationManager relationMgr) {
        this.relationMgr = relationMgr;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
    
    public String execute() {
        try {
            pageList = (ArrayList<Userinfo>) relationMgr.getPageFriendList(uid, start, length);
        } catch (Exception ex) {
            Logger.getLogger(GetFriend.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }
    
    public String getJSON() {
        return execute();
    }
    
    public String goFriendPage() {
        try {
            count = relationMgr.getFriendList(uid).size();
        } catch (Exception ex) {
            Logger.getLogger(GetFriend.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "page";
    }
    
    public String grid(){
        
        try {
            pageList = (ArrayList<Userinfo>) relationMgr.getPageFriendList(uid, start, length);
        } catch (Exception ex) {
            Logger.getLogger(GetFriend.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "grid";
    }
}
