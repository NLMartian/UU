/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author Administrator
 */
public class AuthorityInterceptor extends AbstractInterceptor {   
  
    //拦截Action处理的拦截方法   
    public String intercept(ActionInvocation invocation) throws Exception {   
        // 取得请求相关的ActionContext实例   
        
        ActionContext ctx=invocation.getInvocationContext();   
        Map session=ctx.getSession();   
        //取出名为user的session属性   
        Userinfo user=(Userinfo)session.get("CurrUser");   
        //如果没有登陆，或者登陆所有的用户名不是aumy，都返回重新登陆  
        if(user!=null ){   
          String result=invocation.invoke();
            return result;   
        }   
        //没有登陆，将服务器提示设置成一个HttpServletRequest属性   
        ctx.put("tip","您还没有登录，请登陆系统");   
        return Action.LOGIN;
    }   
}
