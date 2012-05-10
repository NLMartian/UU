/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.Date;
import org.uu.dao.components.UserDao;
import org.uu.dao.model.LoginInfo;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class UserManagerImpl implements UserManager{
    
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    

    @Override
    public long addUser(String loginName, String password, String name, boolean sex, Date birthday, String className, String email) throws Exception {
        try {
            Userinfo user = new  Userinfo();
            user.setName(name);
            user.setBirthday(birthday);
            user.setSex(sex);
            user.setClass_(className);
            user.setEmail(email);
            
            LoginInfo loginInfo = new LoginInfo();
            loginInfo.setLoginName(loginName);    
            loginInfo.setPassword(password);
            
            userDao.save(user, loginInfo);
            return user.getUid();
        }
        catch (Exception e){
            e.printStackTrace();
            throw new Exception("新增用户出现异常");
        }
    }

    @Override
    public boolean checkLogin(String loginName, String password) throws Exception {
        try {
            LoginInfo user = userDao.findUserByNameAndPass(loginName, password);
            if(user != null) {
                return true;
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
             throw new Exception("验证用户出现异常");
        }
        
        return false;
    }

    @Override
    public boolean checkExistLoginName(String loginName) throws Exception {
        try {
            LoginInfo user = userDao.findUserByName(loginName);
            if(user != null) {
                return true;
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
             throw new Exception("验证用户名是否存在时出现异常");
        }
        return false;
    }

    @Override
    public long findUidByLoginName(String loginName) throws Exception {
        try {
            LoginInfo user = userDao.findUserByName(loginName);
            if(user != null) {
                return user.getUserinfo().getUid();
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
             throw new Exception("验证用户名是否存在时出现异常");
        }
        return -1;
    }
    
    
    
}
