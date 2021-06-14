package com.six.electirc_account.controller;

import com.six.electirc_account.constant.MessageConstant;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @Description: 用户控制层
 * @Author: stugxr
 * @Date: 2021/6/11 3:39 下午
 * @Version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

   /**
    *
    * @Description:根据用户名和密码进行登录
    * @author gxr
    * @date 2021/6/12 1:04 上午
    * @param uname 用户名
    * @param pwd 密码
    * @param model 模型
    * @param session 会话
    * @return java.lang.String
    */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String uname, String pwd, Model model,
                        HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        //对用户名和密码进行验空
        if (StringUtils.isNotBlank(uname) && StringUtils.isNotBlank(pwd)) {
            //根据用户名和密码判断该用户是否存在
            User user = userService.checkoutUser(uname, pwd);
            if (user != null) {
                //向session里存放用户信息
                session.setAttribute("user",user);
                try {
                    //将用户信息进行加密并存入cookie
                    userService.saveEncodeUserInfoToCookie(user,request,response);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                //跳转到主页
                return "main";
            } else {
                //跳到登录页面
                model.addAttribute("errorMsg", MessageConstant.USER_EXIST_MSG);
                return "login";
            }
        }
        //跳到登录页面
        model.addAttribute("errorMsg", MessageConstant.LACK_UNAME_MSG);
        return "login";
    }
}
