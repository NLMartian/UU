/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

/**
 *
 * @author 甲骨文
 */
public interface BlogManager {
    
    /**
     * 添加一篇日志
     * @param uid 用户id
     * @param blogContent 日志内容
     * @param blogType 日志类型
     * @param visiable 可见性，即能否被他人所查看
     * @return 日志id
     * @throws Exception 
     */
    long addBlog(long uid, String blogContent, String blogType, boolean visiable)
            throws Exception;
    
    /**
     * 删除日志
     * @param blogId 日志id
     * @return 是否删除成功
     * @throws Exception 
     */
    boolean deleteBlog(long blogId)
            throws Exception;
    
    /**
     * 添加一条日志评论
     * @param commentContent 评论内容
     * @param blogId 日志id
     * @param uid 用户id
     * @return 日志评论id
     * @throws Exception 
     */
    long addBlogComment(String commentContent, long blogId, long uid)
            throws Exception;
    
    /**
     * 删除日志评论
     * @param commentId 评论id
     * @return 是否删除成功
     * @throws Exception 
     */
    boolean deleteBlogComment(long commentId)
            throws Exception;
    
    
}
