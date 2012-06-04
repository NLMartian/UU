/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 甲骨文
 */
public class GoPersonalPage extends BaseAction{
    private long uid;
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
    
    
    
    public String execute() {
        
        try {
            if(mgr.findUserById(uid) == null) {
                return ERROR;
            }
            name = mgr.findUserById(uid).getName();
            
        } catch (Exception ex) {
            Logger.getLogger(GoPersonalPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SUCCESS;
    }
}
