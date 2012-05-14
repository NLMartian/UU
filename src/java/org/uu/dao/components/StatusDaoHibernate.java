/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.uu.dao.model.LoginInfo;
import org.uu.dao.model.Status;
import org.uu.dao.model.StatusComment;

/**
 *
 * @author 甲骨文
 */
public class StatusDaoHibernate extends HibernateDaoSupport implements StatusDao{



    @Override
    public Status getStatusByid(long id) {
        List lstatus = getHibernateTemplate()
                .find("from Status st where st.id=?", id);
        
        if(lstatus !=null && lstatus.size()>=1)
            return (Status)lstatus.get(0);
        return null;
    }


    @Override
    public List<StatusComment> getAllCommentsById(long status_id) {
        List<StatusComment> lcomment = getHibernateTemplate()
                .find("find from StatusComment sc where sc.status_id=?", status_id);
        
         if(lcomment !=null && lcomment.size()>=1)
            return lcomment;
        return null;
        
    }
  

    @Override
    public List<Status> getUserAllStatus(long uid) {
        List<Status> lstatus = getHibernateTemplate()
                .find("find from Status st where st.userinfo.uid=?", uid);
        if(lstatus !=null && lstatus.size()>=1)
            return lstatus;
        return null;
    }

    @Override
    public void saveStatus(Status status) {
         getHibernateTemplate().save(status);
    }

    @Override
    public void deleteStatus(Status status) {
         getHibernateTemplate().delete(getHibernateTemplate().get(Status.class, status.getStatusId()));
    }

    @Override
    public void addComment(StatusComment comment) {
        getHibernateTemplate().save(comment);
    }

    @Override
    public void deleteComment(long commentId) {
        getHibernateTemplate().delete(getHibernateTemplate().get(StatusComment.class, commentId));
    }




  
    
}
