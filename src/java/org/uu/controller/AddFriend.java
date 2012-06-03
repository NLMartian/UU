/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.RelationManager;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class AddFriend extends BaseAction{
    private long uid;
    
    
    // 好友关系逻辑组件
    private RelationManager relationMgr;

    public void setRelationMgr(RelationManager relationMgr) {
        this.relationMgr = relationMgr;
    }
    
    
    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
    
    public String getJSON() {
        return execute();
    }
    
    
    @Override
    public String execute() {
        ActionContext cxt = ActionContext.getContext();
        Map session = cxt.getSession();
        Userinfo user1 = (Userinfo)(session.get("CurrUser"));
        if(user1 == null) {
            return ERROR;
        }
        
        try {
            relationMgr.addRelation(user1.getUid(), uid);
        } catch (Exception ex) {
            Logger.getLogger(AddFriend.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SUCCESS;
    }
    
}
