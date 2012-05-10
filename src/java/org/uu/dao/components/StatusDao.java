/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.uu.dao.model.Status;
import org.uu.dao.model.StatusComment;

/**
 *
 * @author 甲骨文
 */
public interface StatusDao {
    
    /**
     * 增加状态
     * @param status 状态
     */
    void saveStatus(Status status);
    
    
    /**
     * 删除状态
     *  @param status_id 状态id
     */  
    void deleteStatus(Status status);
    
    /**
     * 增加一条评论
     * @param comment 评论
     */
    void addComment(StatusComment comment);
    
    /**
     * 删除评论
     * @param comment 评论
     */
    void deleteComment(StatusComment comment);
    
    
    /**
     * 查找一条状态
     * @param id 状态id
     * @return 
     */
    Status getStatusByid(long id);
    
    
    /**
     * 获得一个用户所有的状态
     * @param uid 用户uid
     * @return 状态的集合
     */
    List<Status> getUserAllStatus(long uid);
    
    
    /**
     * 通过状态id查找所有的评论
     * @param status_id
     * @return 评论的集合
     */
    List<StatusComment> getAllCommentsById(long status_id);
    
    
    
    
    
    
    
}
