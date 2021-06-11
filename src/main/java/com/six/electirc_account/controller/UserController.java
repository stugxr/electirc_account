package com.six.electirc_account.controller;

import com.six.electirc_account.entity.User;
import com.six.electirc_account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
     * @Description:欢迎也-登录页面
     * @author gxr
     * @date 2021/6/11 6:12 下午
     * @param * @param
     * @return java.lang.String
     */
    @RequestMapping("/")
    public String welcome() {
        return "login";
    }

    /**
     *
     * @Description:登录测试用例
     * @author gxr
     * @date 2021/6/11 6:12 下午
     * @param * @param uname
     * @param pwd
     * @return java.lang.String
     */
    @RequestMapping("/login")
    public String login(@PathVariable("uname") String uname, @PathVariable("pwd")String pwd) {
        if (uname != null && !"".equals(uname) && pwd != null && !"".equals(pwd)) {
            User user = userService.checkoutUser(uname, pwd);
            if (user != null) {
                return "main";
            } else {
                return "fail";
            }
        }
        return "fail";
    }


}
