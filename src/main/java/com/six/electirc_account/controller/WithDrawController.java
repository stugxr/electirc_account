package com.six.electirc_account.controller;

import com.six.electirc_account.annotation.LoginRequired;
import com.six.electirc_account.constant.MessageConstant;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.service.UserService;
import com.six.electirc_account.service.WithDrawService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @Description: 提现控制层
 * @Author: gxr
 * @Date: 2021/6/13 11:34 上午
 * @Version: 1.0
 */
@Controller
public class WithDrawController {
    @Autowired
    WithDrawService withDrawService;
    @Autowired
    UserService userService;
    /**
     *
     * @Description:提现操作
     * @author gxr
     * @date 2021/6/13 12:27 下午
     * @param bankType 什么银行
     * @param withDrawMoney 提取金额
     * @param session 会话
     * @return java.lang.String
     */
    @RequestMapping(value = "/withDraw")
    @LoginRequired
    public String withDraw(String bankType, BigDecimal withDrawMoney,
                                HttpSession session, Model model) {
        //对银行类型进行验空
        if (StringUtils.isNotBlank(bankType)) {
            //判断提现金额进是否大于零
            if (withDrawMoney != null && withDrawMoney.compareTo(new BigDecimal(0)) == 1) {
                //生成交易订单并保存
                withDrawService.generateFinancialFlow(bankType,withDrawMoney,session);
                //请求用户授权
                session.setAttribute("bankType",bankType);
                session.setAttribute("withDrawMoney",withDrawMoney);
                return "redirect:toAuthorize";
            }
        }
        model.addAttribute("withDrawMsg", MessageConstant.LACK_WITHDRAW_INFO);
        //提现功能页面，等待前端页面写完
        return null;
    }

    /**
     *
     * @Description:跳转到授权页面
     * @author gxr
     * @date 2021/6/13 4:40 下午
     * @param * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "toAuthorize",method = RequestMethod.GET)
    @LoginRequired
    public String toAuthorize(){
        return "authorize";
    }

    /**
     *
     * @Description:提现转账
     * @author gxr
     * @date 2021/6/14 3:36 上午
     * @param authorizePwd 用户输入的授权密码
     * @param session 会话
     * @param model 模型
     * @return java.lang.String
     */
    @RequestMapping(value = "authorizeWithdraw")
    @LoginRequired
    @Transactional
    public String cashToBank(String authorizePwd,HttpSession session,Model model){
        //获取银行类型和提现金额
        String bankType=(String) session.getAttribute("bankType");
        BigDecimal withDrawMoney=(BigDecimal)session.getAttribute("withDrawMoney");
        //获取用户信息
        User user =(User) session.getAttribute("user");
        int userId=user.getUserId();
        //根据用户名查询银行卡密码
        String bankPwd=userService.getBankCadPwd(userId);
        //判断用户授权密码与银行卡密码一致就进行转账操作
        if(bankPwd.equals(authorizePwd)) {
            //模拟向银行发送请求，银行方进行金额的增加
            withDrawService.addBankBalance(withDrawMoney,bankType,userId);
            //电子账户金额减少
            withDrawService.subElatricAccountMoney(withDrawMoney,userId);
            return "withDrawSuccess";
        }
        //授权失败提示信息
        model.addAttribute("authorizeFail","密码错误，再试一次");
        return "authorize";
    }

}
