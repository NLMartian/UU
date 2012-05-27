/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import org.uu.dao.model.Status;
import com.opensymphony.xwork2.ActionContext;
/**
 *
 * @author Administrator
 */
public class StatusAction extends BaseAction{
    private String status_content;
    
    
    public String getStatus_content()
    {
        return status_content;
    }
    public void setStatus_content(String status_content)
    {
        this.status_content=status_content;
    }
    @Override
    public String execute()throws Exception{
      feedMgr.addFeed(1l, statusMgr.addStatus(1l, status_content), "STATUS");
        return SUCCESS;
    }
}
