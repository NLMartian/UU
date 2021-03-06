package org.uu.dao.model;
// Generated 2012-6-7 16:26:06 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * StatusComment generated by hbm2java
 */
public class StatusComment  implements java.io.Serializable {


     private Long statuscommentId;
     private Userinfo userinfo;
     private Status status;
     private String content;
     private Date time;

    public StatusComment() {
    }

	
    public StatusComment(Userinfo userinfo, Status status, String content) {
        this.userinfo = userinfo;
        this.status = status;
        this.content = content;
    }
    public StatusComment(Userinfo userinfo, Status status, String content, Date time) {
       this.userinfo = userinfo;
       this.status = status;
       this.content = content;
       this.time = time;
    }
   
    public Long getStatuscommentId() {
        return this.statuscommentId;
    }
    
    public void setStatuscommentId(Long statuscommentId) {
        this.statuscommentId = statuscommentId;
    }
    public Userinfo getUserinfo() {
        return this.userinfo;
    }
    
    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }




}


