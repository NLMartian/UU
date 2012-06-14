/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.StatusManager;
import org.uu.dao.model.Status;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class UserCard extends BaseAction{
    private long uid;
    
    private Userinfo user;
    private String statusContent;
    
    
    private StatusManager statusMgr;

    public String getStatusContent() {
        return statusContent;
    }

    public void setStatusContent(String statusContent) {
        this.statusContent = statusContent;
    }

    public void setStatusMgr(StatusManager statusMgr) {
        this.statusMgr = statusMgr;
    }
     
    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public Userinfo getUser() {
        return user;
    }

    public void setUser(Userinfo user) {
        this.user = user;
    }
    
    
    
    public String execute() {
            
            List<Status> status;
        try {
            user = mgr.findUserById(uid);
            status = (ArrayList<Status>)statusMgr.getPageStatus(uid, 0, 1);
            
            
            if(status.isEmpty()) {
                statusContent = "暂时还没有发布状态。";
            }
            else {
                statusContent = status.get(0).getStatusMessage();
            }
        } catch (Exception ex) {
            Logger.getLogger(UserCard.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        if(user == null) {
            return ERROR;
        }
        return SUCCESS;
    }
}
