/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class LoginAction extends BaseAction{
    private String username;
    private String password;
    private Userinfo current_customer;
     

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
        current_customer.setUid(mgr.findUidByLoginName(username));

        if(mgr.checkLogin(username, password)) {
          
            
            
            return SUCCESS;
        }
        else {
            return INPUT;
        }
    }
    
}
