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

/**
 *
 * @author 甲骨文
 */
public class GetPagedStatus extends BaseAction{
    private long uid;
    private int start;
    private int length;
    
    private List<Status> statusList;
    
    private StatusManager statusMgr;

    public List<Status> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Status> statusList) {
        this.statusList = statusList;
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


    public void setStatusMgr(StatusManager statusMgr) {
        this.statusMgr = statusMgr;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
    
    public String execute() {
        try {
            statusList = (ArrayList<Status>)statusMgr.getPageStatus(uid, start, length);
        } catch (Exception ex) {
            Logger.getLogger(GetPagedStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SUCCESS;
    }
    
}
