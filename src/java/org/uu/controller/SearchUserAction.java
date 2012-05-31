/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.UserManager;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class SearchUserAction extends BaseAction {
    
    private List<Userinfo> userList;
    private int page;
    private String keyWord;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Userinfo> getUserList() {
        return userList;
    }

    public void setUserList(List<Userinfo> userList) {
        this.userList = userList;
    }
    
    
    
//    public String execute() {
//        
//        try {
//            userList = mgr.searchUserByName("sb");
//        } catch (Exception ex) {
//            Logger.getLogger(SearchUserAction.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return SUCCESS;
//    }
//    
//    public String getJSON() {
//        return execute();
//    }
    
    public String getPageList() {
        ActionContext ctx= ActionContext.getContext();
        
        
        try {
            userList = mgr.searchUserByName("sb");
            
            
            if(userList == null) {
                ctx.getSession().put("ifnull", "null");

            }
            //ctx.getSession().put("length", userList.size());
            ctx.getSession().put("searchList", (ArrayList<Userinfo>)userList);
            ctx.getSession().put("sb", "草草草");

            
        } catch (Exception ex) {
            Logger.getLogger(SearchUserAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }

}
