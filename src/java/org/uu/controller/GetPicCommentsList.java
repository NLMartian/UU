/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.PicManager;
import org.uu.dao.model.PicComment;

/**
 *
 * @author 甲骨文
 */
public class GetPicCommentsList extends BaseAction{
    private long picId;
    
    private List<PicComment> commentList;
    
    private PicManager picMgr;

    public List<PicComment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<PicComment> commentList) {
        this.commentList = commentList;
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
    
    
    public String execute() {
        try {
            commentList = (ArrayList<PicComment>)picMgr.getAllPicComment(picId);
        } catch (Exception ex) {
            Logger.getLogger(GetPicCommentsList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SUCCESS;
    }
    
    
}
