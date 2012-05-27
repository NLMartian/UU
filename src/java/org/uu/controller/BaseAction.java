/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.uu.bussiness.FeedManager;
import org.uu.bussiness.StatusManager;
import org.uu.bussiness.UserManager;

/**
 *
 * @author 甲骨文
 */
public class BaseAction extends ActionSupport{
    protected UserManager mgr;
    protected StatusManager statusMgr;
    protected FeedManager feedMgr;

    public void setMgr(UserManager mgr) {
        this.mgr = mgr;
    }
    
    public void setstatusMgr(StatusManager statusMgr){
        this.statusMgr=statusMgr;
    }
    public void setfeedMgr(FeedManager feedMgr){
        this.feedMgr=feedMgr;
    }
    
}
