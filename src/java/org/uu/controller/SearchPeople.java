/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.StatusManager;
import org.uu.bussiness.UserManager;
import org.uu.dao.components.UserDao;
import org.uu.dao.model.Status;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class SearchPeople extends BaseAction {
    
    private List<Userinfo>      gridModel;
    private Integer             rows             = 0;
    private Integer             page             = 0;
    private Integer             total            = 0;
    private Integer             record           = 0;
    private String              sord;
    private String              sidx;
    private String              searchField;
    private String              searchString;
    private String              searchOper;
    private boolean             loadonce         = false;
    
    private String              searchContent;    
    
    private UserDao userdao;
    private StatusManager statusMgr;

    public void setStatusMgr(StatusManager statusMgr) {
        this.statusMgr = statusMgr;
    }

    
    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
    
    
    
    public String execute() {
       
        total = 1;
        record = 1;
        
        try {
            //gridModel = statusMgr.getAllStatus(1);
            gridModel = new ArrayList<Userinfo>();
//            gridModel.add(
//                     new Userinfo("hahahah", false, new Date(), ""));
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(SearchPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return SUCCESS;
    }
    
    public String getJSON() {
        return execute();
    }
    
    // Setter and Getter

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }
    
    public List<Userinfo> getGridModel() {
        return gridModel;
    }

    public void setGridModel(List<Userinfo> gridModel) {
        this.gridModel = gridModel;
    }

    public boolean isLoadonce() {
        return loadonce;
    }

    public void setLoadonce(boolean loadonce) {
        this.loadonce = loadonce;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchOper() {
        return searchOper;
    }

    public void setSearchOper(String searchOper) {
        this.searchOper = searchOper;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
 
}
