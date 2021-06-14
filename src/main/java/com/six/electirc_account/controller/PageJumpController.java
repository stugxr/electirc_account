package com.six.electirc_account.controller;

import com.six.electirc_account.annotation.LoginRequired;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.service.WithDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @Description: jsp页面跳转的控制器
 * @Author: stugxr
 * @Date: 2021/6/14 4:00 下午
 * @Version: 1.0
 */
@Controller
public class PageJumpController {
    @Autowired
    WithDrawService withDrawService;
    /**
     *
     * @Description:跳转到登录页面
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toLogin")
    public String toLogin(){
        return "login1";
    }

    /**
     *
     * @Description:跳转到主页
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toIndex")
    public String toIndex(){
        return "index";
    }


    /**
     *
     * @Description:跳转到了解更多
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toSingle")
    public String toSingle(){
        return "single";
    }

    /**
     *
     * @Description:跳转到余额管理
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toCost")
    @LoginRequired
    public String toCost(HttpSession session, Model model){
        User user =(User) session.getAttribute("user");
        BigDecimal elatricMoney = withDrawService.getElatricMoney(user.getUserId());
        model.addAttribute("elatricMoney", elatricMoney);
        return "cost";
    }

    /**
     *
     * @Description:跳转到余额管理
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toSalary")
    @LoginRequired
    public String toSalary(){

        return "salary";
    }

    /**
     *
     * @Description:跳转到充值页面
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toCz")
    @LoginRequired
    public String toDepositPage(){
        return "cz";
    }

    /**
     *
     * @Description:跳转到提现页面
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toTx")
    @LoginRequired
    public String toWithDrawPage(){
        return "tx";
    }

    /**
     *
     * @Description:跳转到提现授权页面
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toAuthorize",method = RequestMethod.GET)
    @LoginRequired
    public String toAuthorize(){
        return "withDrawAuthorize";
    }

    /**
     *
     * @Description:跳转到个人主页
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toUserIndex")
    @LoginRequired
    public String toUserIndex(){
        return "UserIndex";
    }

    /**
     *
     * @Description:跳转到充值授权页面
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toChargeAuthorize",method = RequestMethod.GET)
    @LoginRequired
    public String toChargeAuthorize(){
        return "rechargeAuthorize";
    }

}
