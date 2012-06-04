/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
/**
 *
 * @author 甲骨文
 */
public class FirstAjaxAction extends ActionSupport {
    private String textarea;
    private String echo;

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }
    
    
    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }
    
    
    public String execute()throws Exception {
        this.echo = this.textarea + "，尼玛！";
        
        return Action.SUCCESS;
    }
    
    public String getJSON()throws Exception  {
        return execute();
    }
    
            
}
