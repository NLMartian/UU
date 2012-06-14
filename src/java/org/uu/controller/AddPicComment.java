/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.PicManager;
import org.uu.dao.model.PicComment;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class AddPicComment {
    private long picId;
    private String content;
    
    private Date time;
    private PicComment comment;
    
    private PicManager picMgr;

    public PicComment getComment() {
        return comment;
    }

    public void setComment(PicComment comment) {
        this.comment = comment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPicId() {
        return picId;
    }

    public void setPicId(long picId) {
        this.picId = picId;
    }


    public void setPicMgr(PicManager picMgr) {
        this.picMgr = picMgr;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
    public String addComment() {
        
        try {
            Userinfo user = (Userinfo)ActionContext.getContext().getSession().get("CurrUser");
            comment = picMgr.addPicComment(user.getUid(), picId, content);
            
            time = comment.getTime();
        }catch(Exception ex){
            Logger.getLogger(AddStatusComment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "success";
    }
    
    
}
