/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

/**
 *
 * @author 甲骨文
 */
public class AllOnesStatus extends BaseAction{
        private long uid;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
        
        public String execute() {
            return SUCCESS;
        }
}
