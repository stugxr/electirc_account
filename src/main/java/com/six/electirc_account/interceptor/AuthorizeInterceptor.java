package com.six.electirc_account.interceptor;

import com.six.electirc_account.annotation.LoginRequired;
import com.six.electirc_account.constant.UserConstant;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.util.CookieUtil;
import com.six.electirc_account.util.Md5Util;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 登录拦截器
 * @Author: stugxr
 * @Date: 2021/6/14 10:30 上午
 * @Version: 1.0
 */
@Component
public class AuthorizeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取方法上是否有需要登录的注解
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            LoginRequired loginRequired = handlerMethod.getMethodAnnotation(LoginRequired.class);
            //没有直接放行
            if(loginRequired==null){
                return true;
            }
            //有的话进行需要拦截
            //获取session里的用户信息
            User user = (User)request.getSession().getAttribute("user");
            if(user!=null){
                //获取cookie中的加了密的用户信息
                String cookieValue = CookieUtil.getCookieValue(request, UserConstant.COOKIE_USER_NAME, true);
                //将用户信息与加了密的用户信息进行校验
                boolean enCodeResult = Md5Util.validPassword(user.toString(), cookieValue);
                if(enCodeResult){
                    //一致则放行
                    return true;
                }
            }
            //不一致重定向到登录页面
            response.sendRedirect("http://localhost:8088/toLogin");
            return false;
        }
        //如果是一次静态资源的请求则该handler不应该是HandlerMethod的实现类
        return true;
    }
}
