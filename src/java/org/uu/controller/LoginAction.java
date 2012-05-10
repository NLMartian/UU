/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author 甲骨文
 */
public class LoginAction extends BaseAction{
    private String username;
    private String password;
     

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
       
        if(mgr.checkLogin(username, password)) {
            session.put("username", username);
            session.put("uid", mgr.findUidByLoginName(username));
            return SUCCESS;
        }
        else {
            return INPUT;
        }
        
//        if(mgr == null)
//            return SUCCESS;
//        else
//            return INPUT;
       
    }
    
}
