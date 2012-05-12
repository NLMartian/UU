/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
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
    public List<Feed> getAllFeedByUid(long uid) {
         List<Feed> lfeeds = getHibernateTemplate()
                .find("find from Feed st where st.userinfo.uid=?", uid);
        if(lfeeds !=null && lfeeds.size()>=1)
            return lfeeds;
        return null;
    }
    
}
