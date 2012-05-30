/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
import org.uu.dao.model.LoginInfo;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public interface UserDao {
    /**
     * 查找用户
     * @param id 用户uid
     * @return 用户信息
     */
    Userinfo getUser(long id);
    
    /**
     * 保存用户信息
     * @param user 用户信息
     */
    void save(Userinfo user, LoginInfo loginInfo);
    
    /**
     * 修改用户
     * @param user 用户信息
     */
    void update(Userinfo user);
    
    /**
     * 删除用户
     * @param user  用户信息
     */
    void delete(Userinfo user);
    
    
    /**
     * 删除用户
     * @param id 用户uid
     */
    void delete(long id);
    
    /**
     * 根据登录名，密码查找用户
     * @param loginName 用户名
     * @param password 密码
     * @return 找到用户
     */
    LoginInfo findUserByNameAndPass(String loginName, String password);
    
    
    /**
     * 根据登录名查找用户
     * @param loginName 用户名
     * @return 找到用户
     */
    LoginInfo findUserByName(String loginName);
    
    /**
     * 根据用户姓名查找用户信息
     * @param name
     * @return 
     */
    List<Userinfo> searchUserByName(String name);
    
    
    
      
}
