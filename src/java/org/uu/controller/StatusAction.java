/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import org.uu.dao.model.Status;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import org.uu.dao.model.Userinfo;
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
      Map session = ActionContext.getContext().getSession();
      Userinfo user = (Userinfo)session.get("CurrUser");
      Long uid = user.getUid();
      
      feedMgr.addFeed(uid, statusMgr.addStatus(uid, status_content), "STATUS");
        return SUCCESS;
    }
}
