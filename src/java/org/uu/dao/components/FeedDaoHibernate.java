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
import org.uu.dao.model.Feed;

/**
 *
 * @author 甲骨文
 */
public class FeedDaoHibernate extends HibernateDaoSupport implements FeedDao{

    @Override
    public void addFeed(Feed feed) {
       getHibernateTemplate().save(feed);
    }

    @Override
    public Feed getFeedById(long feedId) {
       List lfeeds = getHibernateTemplate()
                .find("from Feed ft where ft.id=?", feedId);
        
        if(lfeeds !=null && lfeeds.size()>=1)
            return (Feed)lfeeds.get(0);
        return null;
    }

    @Override
    public List<Feed> getAllFeedByUid(final long uid) {
         final String HQL = "from Feed as fd "
                + "where fd.userinfo.uid in"
                + "( select relation.uid2 from Userrelation as relation  where relation.uid1=:userId)"
                + "OR fd.userinfo.uid=:userId"
                + "order by fd.feedId desc";
        
        List<Feed> list = getHibernateTemplate().executeFind(new HibernateCallback() {  
              
            public Object doInHibernate(Session session) throws HibernateException,  
                    SQLException {  
                List<Feed> result = session.createQuery(HQL).setLong("userId", uid) 
                                .list();  
                return result;  
            }  
        });  
        return list;
    }

    @Override
    public List<Feed> getPageFeed(final long uid, final int start, final int length) {
        final String HQL = "from Feed as fd "
                + "where fd.userinfo.uid in"
                + "( select relation.uid2 from Userrelation as relation  where relation.uid1=?)"
                + "OR fd.userinfo.uid=?"
                + "order by fd.feedId desc";
        
        List<Feed> list = getHibernateTemplate().executeFind(new HibernateCallback() {  
              
            public Object doInHibernate(Session session) throws HibernateException,  
                    SQLException {  
                List<Feed> result = session.createQuery(HQL).setFirstResult(start)  
                                .setParameter(0, uid).setParameter(1, uid)  
                                .setMaxResults(length)  
                                .list();  
                return result;  
            }  
        });  
        return list;
    }
    
}
