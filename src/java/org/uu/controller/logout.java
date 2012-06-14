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
public class logout extends BaseAction{
    public String execute() {
        
        Map session = ActionContext.getContext().getSession();
        session.remove("CurrUser");
        
        return SUCCESS;
    }
}
