/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.uu.dao.model.Blog;
import org.uu.dao.model.BlogComment;
import org.uu.dao.model.Status;
import org.uu.dao.model.StatusComment;

/**
 * BlogDao实现类
 * @author 甲骨文
 */
public class BlogDaoHibernate extends HibernateDaoSupport implements BlogDao{

    @Override
    public void addBlog(Blog blog) {
        this.getHibernateTemplate().save(blog);
    }

    @Override
    public void delete(Blog blog) {
        getHibernateTemplate().delete(blog);
    }

    @Override
    public Blog getBlogById(long blogId) {
        return getHibernateTemplate().get(Blog.class, blogId);
    }

    @Override
    public List<Blog> getPageBlog(final long uid, final int start, final int length) {
        final String HQL = "from Blog as bg "
                + "where bg.userinfo.uid=?"
                + "order by bg.statusId desc";
        
        List<Blog> list = getHibernateTemplate().executeFind(new HibernateCallback() {  
              
            public Object doInHibernate(Session session) throws HibernateException,  
                    SQLException {  
                List<Blog> result = session.createQuery(HQL).setFirstResult(start)  
                                .setParameter(0, uid)  
                                .setMaxResults(length)  
                                .list();  
                return result;  
            }  
        });  
        return list;
    }

    @Override
    public void addComment(BlogComment comment) {
        getHibernateTemplate().save(comment);
    }

    @Override
    public void deleteComment(BlogComment comment) {
        getHibernateTemplate().delete(comment);
    }

    @Override
    public List<BlogComment> getBlogComment(long BlogId) {
        List<BlogComment> lcomment = getHibernateTemplate()
                .find("find from BlogComment sc where sc.blog_id=?", BlogId);
        
         if(lcomment !=null && lcomment.size()>=1)
            return lcomment;
        return null;
    }

    @Override
    public BlogComment getBlogCommentById(long commentId) {
        return getHibernateTemplate().get(BlogComment.class, commentId);
    }

    
    
}
