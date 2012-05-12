/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.Date;

/**
 *
 * @author 甲骨文
 */
public class RegAction extends BaseAction {
    private String loginName;
    private String password;
    private String name;
    private Date birthday;
    private boolean sex;
    private String className;
    private String email;

    @Override
    public String execute() throws Exception {
        
        long uid = mgr.addUser(loginName, password, name, sex,
                birthday, className, email);
        ActionContext.getContext().getSession().put("uid", uid);
        
        
        return SUCCESS;
    }
    
    
}
