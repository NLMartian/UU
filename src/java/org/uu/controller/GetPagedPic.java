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
import org.uu.dao.model.Picture;

/**
 *
 * @author 甲骨文
 */
public class GetPagedPic extends BaseAction{
    private long uid;
    private int start;
    private int length;
    
    private List<Picture> picList;
    
    private PicManager picMgr;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<Picture> getPicList() {
        return picList;
    }

    public void setPicList(List<Picture> picList) {
        this.picList = picList;
    }

    public void setPicMgr(PicManager picMgr) {
        this.picMgr = picMgr;
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
            picList = (ArrayList<Picture>)picMgr.getpagedPic(uid, start, length);
        } catch (Exception ex) {
            Logger.getLogger(GetPagedPic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }
    
    
}
