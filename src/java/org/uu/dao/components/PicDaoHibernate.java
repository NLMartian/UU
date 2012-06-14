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
import org.uu.dao.model.PicComment;
import org.uu.dao.model.Picture;

/**
 *
 * @author 甲骨文
 */
public class PicDaoHibernate extends HibernateDaoSupport implements PicDao{

    @Override
    public void addPic(Picture pic) {
        getHibernateTemplate().save(pic);
    }

    @Override
    public void addPicComment(PicComment pic_comment) {
        getHibernateTemplate().save(pic_comment);
    }

    @Override
    public List<Picture> getPagePic(final long uid, final int start, final int length) {
        final String HQL = "from Picture as st "
                + "where st.userinfo.uid=?"
                + "order by st.picId desc";
        
        List<Picture> list = getHibernateTemplate().executeFind(new HibernateCallback() {  
              
            public Object doInHibernate(Session session) throws HibernateException,  
                    SQLException {  
                List<Picture> result = session.createQuery(HQL).setFirstResult(start)  
                                .setParameter(0, uid)  
                                .setMaxResults(length)  
                                .list();  
                return result;  
            }  
        });  
        return list;
    }

    @Override
    public List<PicComment> getAllPicComment(long pic_id) {
        
        List<PicComment> lstatus = getHibernateTemplate()
                .find("from PicComment st where st.picture.picId=?", pic_id);
        if(lstatus !=null && lstatus.size()>=1)
            return lstatus;
        return null;
    
    }

    @Override
    public Picture getPicById(long picId) {
        return getHibernateTemplate().get(Picture.class, picId);
    }
    
}
