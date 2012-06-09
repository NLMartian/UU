/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.struts2.json.annotations.JSON;
import org.uu.bussiness.StatusManager;
import org.uu.dao.model.StatusComment;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class AddStatusComment {
    
    private long status_id;
    private String content;
    
    
    private Date time;
    private StatusComment comment;
    
    private StatusManager statusMgr;

    @JSON(format="yyyy-MM-dd HH:mm:ss")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public StatusComment getComment() {
        return comment;
    }

    public void setComment(StatusComment comment) {
        this.comment = comment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatusMgr(StatusManager statusMgr) {
        this.statusMgr = statusMgr;
    }

    public long getStatus_id() {
        return status_id;
    }

    public void setStatus_id(long status_id) {
        this.status_id = status_id;
    }

   
    
    public String addComment() {
        try {
            Userinfo user = (Userinfo)ActionContext.getContext().getSession().get("CurrUser");
            
            comment = statusMgr.addComment(content, status_id, user.getUid());
            time = comment.getTime();
            
        } catch (Exception ex) {
            Logger.getLogger(AddStatusComment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "success";
    }
    
    
   
    
    
}
