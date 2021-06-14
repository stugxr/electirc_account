package com.six.electirc_account.controller;

import com.six.electirc_account.annotation.LoginRequired;
import com.six.electirc_account.constant.TransferConstant;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.service.RechargeService;
import com.six.electirc_account.service.UserService;
import com.six.electirc_account.service.WithDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @Description: 授权控制层
 * @Author: stugxr
 * @Date: 2021/6/14 9:05 下午
 * @Version: 1.0
 */
@Controller
public class AuthorizeController {
    @Autowired
    WithDrawService withDrawService;
    @Autowired
    RechargeService rechargeService;
    @Autowired
    UserService userService;

    /**
     * @param authorizePwd 用户输入的授权密码
     * @param session      会话
     * @param model        模型
     * @return java.lang.String
     * @Description:提现转账
     * @author gxr
     * @date 2021/6/14 3:36 上午
     */
    @RequestMapping(value = "authorizeTransfer")
    @LoginRequired
    @Transactional
    public String authorizeTransfer(String authorizePwd, HttpSession session, Model model) {
        //获取银行类型,提现金额,充值金额
        String bankType = null;
        BigDecimal withDrawMoney = null;
        BigDecimal rechargeMoney = null;
        if (session.getAttribute("bankType") != null) {
            bankType = (String) session.getAttribute("bankType");
        }
        if (session.getAttribute("withDrawMoney") != null) {
            withDrawMoney = (BigDecimal) session.getAttribute("withDrawMoney");
        }
        if (session.getAttribute("rechargeMoney") != null) {
            rechargeMoney = (BigDecimal) session.getAttribute("rechargeMoney");
        }
        //获取用户信息
        User user = (User) session.getAttribute("user");
        int userId = user.getUserId();
        //根据用户id和银行类型查询银行卡密码
        String bankPwd = userService.getBankCadPwd(userId, bankType);
        //判断用户授权密码与银行卡密码一致就进行对应操作
        if (bankPwd.equals(authorizePwd)) {
            //获取操作类型
            String transferType = (String) session.getAttribute("transferType");
            if (TransferConstant.TRANSFER_RECHARGE.equals(transferType)) {
                //模拟向银行发送请求，银行方进行金额的减少
                rechargeService.reduceBankBalance(rechargeMoney, bankType, userId);
                //电子账户金额增加
                rechargeService.addAccountMoney(rechargeMoney, userId);
                return "rechargeSuccess";
            } else if (TransferConstant.TRANSFER_WITHDRAW.equals(transferType)) {
                //模拟向银行发送请求，银行方进行金额的增加
                withDrawService.addBankBalance(withDrawMoney, bankType, userId);
                //电子账户金额减少
                withDrawService.subElatricAccountMoney(withDrawMoney, userId);
                return "withDrawSuccess";
            }
        }
        //授权失败提示信息
        model.addAttribute("authorizeFail", "密码错误，再试一次");
        return "authorize";
    }

}
