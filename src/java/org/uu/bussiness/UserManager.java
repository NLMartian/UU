/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.Date;
import java.util.List;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public interface UserManager {
    /**
     *  新增加用户
     * @param loginName 新增用户名 
     * @param password  密码
     * @param name 用户姓名
     * @param sex 性别
     * @param birthday
     * @param className 班级
     * @param email
     * @return 新用户的uid
     */
     long addUser(String loginName, String password, String name, 
             boolean sex, Date birthday, String className, String email, String avatar)
             throws Exception;
     
     
     /**
      * 更新用户信息
      * @param uid
      * @param avatar
      * @return
      * @throws Exception 
      */
     long updateUserAvatar(long uid, String avatar)
             throws Exception;
     
      /**
     *  验证用户登录
     * @param loginName 新增用户名 
     * @param password  密码
     * @return 登录结果
     */
     boolean checkLogin(String loginName, String password)
             throws Exception;
     
     
     /**
      * 检查是否存在用户名
      * @param loginName 用户名
      * @return 检查结果
      */
     boolean checkExistLoginName(String loginName)
             throws Exception;
     
     /**
      * 根据用户名查找用户信息
      * @param loginName 登录名
      * @return 用户Uid
      * @throws Exception 
      */
     Userinfo findUserByLoginName(String loginName)
             throws Exception;
     
     /**
      * 通过姓名查找用户
      * @param name
      * @return
      * @throws Exception 
      */
     List<Userinfo> searchUserByName(String name)
             throws Exception;
     
     /**
      * 根据用户uid查找用户
      * @param uid
      * @return
      * @throws Exception 
      */
     Userinfo findUserById(long uid)
             throws Exception;
}
