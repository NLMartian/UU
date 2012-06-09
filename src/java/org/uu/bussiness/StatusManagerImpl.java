/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.Date;
import java.util.List;
import org.uu.dao.components.StatusDao;
import org.uu.dao.components.UserDao;
import org.uu.dao.model.Status;
import org.uu.dao.model.StatusComment;

/**
 *
 * @author 甲骨文
 */
public class StatusManagerImpl implements StatusManager{
    private UserDao userDao;
    
    private StatusDao statusDao;

    public void setStatusDao(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Status addStatus(long uid, String statusContent) throws Exception {
        
        try {
            Status status = new Status();
            
            status.setStatusMessage(statusContent);
            status.setUserinfo(userDao.getUser(uid));
            status.setTime(new Date());
            
            statusDao.saveStatus(status);
            return status;
        }
        catch(Exception e) {
             e.printStackTrace();
            throw new Exception("新增状态出现异常");
        }
        
        
    }

    @Override
    public boolean deleteStatus(long statusId) throws Exception {
        
        try{
            Status status = statusDao.getStatusByid(statusId);
            
            statusDao.deleteStatus(status);
            return true;
        }
        catch(Exception e) {
             e.printStackTrace();
            throw new Exception("新增状态出现异常");
        }
    }

    @Override
    public StatusComment addComment(String commentContent, long statusId, long uid) throws Exception {
        
        try {
            StatusComment comment = new StatusComment();
            comment.setContent(commentContent);
            comment.setTime(new Date());
            comment.setUserinfo(userDao.getUser(uid));
            comment.setStatus(statusDao.getStatusByid(statusId));
            
            statusDao.addComment(comment);
            return comment;           
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("添加评论出现异常");
        }
        
    }

    @Override
    public boolean deleteComment(long commentId) throws Exception {
        try {
            statusDao.deleteComment(commentId);
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("删除评论出现异常");
        }
    }

    @Override
    public List<Status> getAllStatus(long userId) throws Exception {
        try {
            return statusDao.getUserAllStatus(userId);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("获取用户状态时出错");
        }
    }

    @Override
    public List<StatusComment> getAllComments(long statusId) throws Exception {
        try {
            return statusDao.getAllCommentsById(statusId);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("获取一条状态的评论时出错");
        }
    }

    @Override
    public List<Status> getPageStatus(long userId, int start, int length) throws Exception {
        try {
                return statusDao.getPageStatus(userId, start, length);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("获取分页状态的评论时出错");
        }    
    }
    
    
    
}
