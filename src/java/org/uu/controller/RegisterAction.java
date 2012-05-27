/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Administrator
 */
public class RegisterAction extends BaseAction{
     private String login_name;
     private String name;
     private String password;
     private boolean sex;
     private String birthday_yyyy;
     private String birthday_mm;
     private String birthday_dd;
     private Date birthday;
     private String className;
     private String email;
     
     public String getLogin_name()
     {
         return login_name;
     }
     public void setLogin_name(String login_name)
     {
         this.login_name=login_name;
     }
     public String getName()
     {
         return name;
     }
     public void setName(String name)
     {
         this.name=name;
     }
     public String getPassword()
     {
         return password;
     }
     public void setPassword(String password)
     {
         this.password=password;
     }
     public boolean getSex()
     {
         return sex;
     }
     public void setSex(String radio_sex)
     {
         if(radio_sex=="0")
             this.sex=true;
         else
             this.sex=false;
     }
     public String getBirthday_yyyy()
     {
         return birthday_yyyy;
     }
     public void setBirthday_yyyy(String birthday_yyyy)
     {
         this.birthday_yyyy=birthday_yyyy;
     }
     public String getBirthday_mm()
     {
         return birthday_mm;
     }
     public void setBirthday_mm(String birthday_mm)
     {
         this.birthday_mm=birthday_mm;
     }
     public String getBirthday_dd()
     {
         return birthday_dd;
     }
     public void setBirthday_dd(String birthday_dd)
     {
         this.birthday_dd=birthday_dd;
     }

     public void formatBirthday(String birthday_yyyy,String birthday_mm,String birthday_dd) throws ParseException
     {
         DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd"); 
         Date date_birthday=new Date();
         String real_birthday=birthday_yyyy+"-"+birthday_mm+"-"+birthday_dd;
        // String real_birthday="2012-03-02";
         date_birthday=fmt.parse(real_birthday);
         this.birthday=date_birthday;
     }
     public String getClassName()
     {
         return className;
     }
     public void setClassName(String class_)
     {
         this.className=class_;
     }
     public String getEmail()
     {
         return email;
     }
     public void setEmail(String email)
     {
         this.email=email;
     }
     @Override
     public String execute()throws Exception{   
         formatBirthday(birthday_yyyy,birthday_mm,birthday_mm);
         mgr.addUser(login_name, password, name, sex, birthday,className, email);
         return SUCCESS;
     }

    @Override
    public void validate() {
        try {
            // 检查登录名是否存在
            if(mgr.checkExistLoginName(login_name)) {
                  addFieldError("login_name", "用户名已存在！");
            }
        } catch (Exception ex) {
            Logger.getLogger(RegisterAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     
}
