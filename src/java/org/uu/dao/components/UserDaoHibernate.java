/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.uu.dao.model.LoginInfo;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class UserDaoHibernate extends HibernateDaoSupport implements UserDao{

    @Override
    public Userinfo getUser(long id) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        return (Userinfo)getHibernateTemplate().get(Userinfo.class,id);
    }

    @Override
    public void save(Userinfo user, LoginInfo loginInfo) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        getHibernateTemplate().save(user);
        getHibernateTemplate().save(loginInfo);
    }

    @Override
    public void update(Userinfo user) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        getHibernateTemplate().saveOrUpdate(user);
    }

    @Override
    public void delete(Userinfo user) {
     //   throw new UnsupportedOperationException("Not supported yet.");
        getHibernateTemplate().delete(getHibernateTemplate().get(Userinfo.class, user.getUid()));
    }

    @Override
    public void delete(long  id) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        getHibernateTemplate().delete(getHibernateTemplate().get(Userinfo.class, id));
    }

    @Override
    public LoginInfo findUserByNameAndPass(String loginName, String password) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        List lp=getHibernateTemplate()
                .find("from LoginInfo au where au.loginName=? and au.password=?",
                new String[]{loginName, password});    
        if(lp !=null && lp.size()>=1)
            return (LoginInfo)lp.get(0);
        return null;
     }

    @Override
    public LoginInfo findUserByName(String loginName) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        List ln =getHibernateTemplate()
                .find("from LoginInfo au where au.loginName=?",
                loginName);
        if(ln !=null && ln.size()>=1)
            return (LoginInfo)ln.get(0);
        return null;
    }

    // 根据用户姓名查找用户，这里没有用到检索引擎，只能找到同名的用户。
    @Override
    public List<Userinfo> searchUserByName(String name) {
        //throw new UnsupportedOperationException("Not supported yet.");
        List<Userinfo> ln =getHibernateTemplate()
                .find("from Userinfo info where info.name=?",
                name);
        if(ln !=null && ln.size()>=1)
            return ln;
        return null;
    }
    
}
