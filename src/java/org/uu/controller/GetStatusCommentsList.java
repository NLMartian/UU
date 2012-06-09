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
import org.uu.dao.model.StatusComment;

/**
 *
 * @author 甲骨文
 */
public class GetStatusCommentsList extends BaseAction{
    private long statusId;
    
    private List<StatusComment> commentList;
    
    private StatusManager statusMgr;

    public List<StatusComment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<StatusComment> commentList) {
        this.commentList = commentList;
    }

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }

    public void setStatusMgr(StatusManager statusMgr) {
        this.statusMgr = statusMgr;
    }
    
    public String execute() {
        
        try {
            commentList = (ArrayList<StatusComment>)statusMgr.getAllComments(statusId);
        } catch (Exception ex) {
            Logger.getLogger(GetStatusCommentsList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }
    
}
