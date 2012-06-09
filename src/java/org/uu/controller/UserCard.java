/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class UserCard extends BaseAction{
    private long uid;
    
    private Userinfo user;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public Userinfo getUser() {
        return user;
    }

    public void setUser(Userinfo user) {
        this.user = user;
    }
    
    
    
    public String execute() {
        
        try {
            user = mgr.findUserById(uid);
        } catch (Exception ex) {
            Logger.getLogger(UserCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(user == null) {
            return ERROR;
        }
        return SUCCESS;
    }
}
