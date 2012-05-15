/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.List;
import org.uu.dao.model.Status;
import org.uu.dao.model.StatusComment;

/**
 *
 * @author 甲骨文
 */
public interface StatusManager {
    
    /**
     * 添加一条状态
     * @param uid 用户id
     * @param statusContent 状态内容
     * @return 状态di
     */
    long addStatus(long uid, String statusContent)
            throws Exception;
    
    /**
     * 根据状态id删除状态
     * @param statusId 状态id
     * @return 如存在则返回true,否则false
     */
    boolean deleteStatus(long statusId)
            throws Exception;
     
    /**
     * 获取用户的所有状态
     * @param userId
     * @return
     * @throws Exception 
     */
    List<Status> getAllStatus(long userId)
            throws Exception;
    
    /**
     * 获取一条状态所有的评论
     * @param statusId 状态ID
     * @return 所有状态列表
     * @throws Exception 
     */
    List<StatusComment> getAllComments(long statusId)
            throws Exception;
    
    /**
     * 添加一条评论
     * @param commentContent
     * @param statusId
     * @param uid
     * @return 
     */
    long addComment(String commentContent, long statusId, long uid)
            throws Exception;
    
    /**
     * 删除评论
     * @param commentId 评论id
     * @return 不存在返回false
     */
    boolean deleteComment(long commentId)
            throws Exception;
    
   
}
