/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
import org.uu.dao.model.Blog;
import org.uu.dao.model.BlogComment;

/**
 *
 * @author 甲骨文
 */
public interface BlogDao {
    
    /**
     * 添加一篇日志
     * @param blog 要添加的日志 
     */
    void addBlog(Blog blog);
    
    
    
    /**
     * 删除一篇日志
     * @param blog 要删除的日志
     */
    void delete(Blog blog);
    
    /**
     * 根据日志id查找日志
     * @param blogId 日志id
     * @return 若无此blog则返回null，否则返回找到的Blog。
     */
    Blog getBlogById(long blogId);
    
    /**
     * 获取分页日志
     * @param uid 用户id
     * @param start 开始索引号
     * @param length 页长度
     * @return 分页日志列表
     */
    List<Blog> getPageBlog(long uid, int start, int length);
    
    /**
     * 添加一天日志评论
     * @param comment 要添加的日志评论
     */
    void addComment(BlogComment comment);
    
    /**
     * 删除一天日志评论
     * @param comment 
     */
    void deleteComment(BlogComment comment);
    
    /**
    * 获取一篇日志的所有评论
    * @param BlogId 日志id
    * @return 日志评论
    */
    List<BlogComment> getBlogComment(long BlogId);
    
    /**
     * 通过id号查找日志评论
     * @param commentId 日志评论id 
     * @return 日志评论
     */
    BlogComment getBlogCommentById(long commentId);
    
    
}
