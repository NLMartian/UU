/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.Date;
import org.uu.dao.components.BlogDao;
import org.uu.dao.components.UserDao;
import org.uu.dao.model.Blog;
import org.uu.dao.model.BlogComment;

/**
 *
 * @author 甲骨文
 */
public class BlogManagerImpl implements BlogManager{
    private BlogDao blogDao;
    private UserDao userDao;

    public void setBlogDao(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public long addBlog(long uid, String blogContent, String blogType, boolean visiable) throws Exception {
        try {
            Blog blog = new Blog();
            blog.setUserinfo(userDao.getUser(uid));
            blog.setBlogContent(blogContent);
            blog.setBlogType(blogType);
            blog.setVisiable(visiable);
            blog.setViewCount(0);
            blog.setCommentCount(0);
            blog.setTime(new Date());
            blogDao.addBlog(blog);
            return blog.getBlogId();
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("新增日志时出错。");
        }
        
    }

    @Override
    public boolean deleteBlog(long blogId) throws Exception {
        try {
            Blog blog = blogDao.getBlogById(blogId);
            blogDao.delete(blog);
            
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("删除日志时出错。");
        }
    }

    @Override
    public long addBlogComment(String commentContent, long blogId, long uid) throws Exception {
        try {
            BlogComment comment = new BlogComment();
            comment.setBlog(blogDao.getBlogById(blogId));
            comment.setContent(commentContent);
            comment.setTime(new Date());
            comment.setUserinfo(userDao.getUser(uid));
            blogDao.addComment(comment);
            return comment.getBlogcommentId();
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("增加日志评论时出错。");
        }
    }

    @Override
    public boolean deleteBlogComment(long commentId) throws Exception {
        try {
            BlogComment comment = blogDao.getBlogCommentById(commentId);
            blogDao.deleteComment(comment);
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("删除日志评论时出错。");
        }
    }
    
    
    
}
