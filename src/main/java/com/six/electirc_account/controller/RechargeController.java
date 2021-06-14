package com.six.electirc_account.controller;

import com.six.electirc_account.annotation.LoginRequired;
import com.six.electirc_account.constant.MessageConstant;
import com.six.electirc_account.constant.TransferConstant;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.service.RechargeService;
import com.six.electirc_account.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

@Controller
public class RechargeController {
    @Autowired
    RechargeService rechargeService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/recharge")
    @LoginRequired
    public String Recharge(String bankType, BigDecimal rechargeMoney, HttpSession session, Model model) {
        //对充值金额和银行类型进行验空
        if (StringUtils.isNotBlank(bankType) && rechargeMoney != null) {
            //获取用户信息
            User user = (User) session.getAttribute("user");
            //跟据用户id和银行卡类型查询银行卡余额
            BigDecimal bankMoney = rechargeService.getBankMoney(user.getUserId(), bankType);
            //判断充值金额是否大于零且大于银行卡余额
            if (rechargeMoney.compareTo(new BigDecimal(0)) == 1 && rechargeMoney.compareTo(bankMoney) == -1) {
                //生成交易订单并保存
                rechargeService.generateFinancialFlow(bankType, rechargeMoney, bankMoney, session);
                //请求用户授权
                session.setAttribute("bankType", bankType);
                session.setAttribute("rechargeMoney", rechargeMoney);
                session.setAttribute("transferType", TransferConstant.TRANSFER_RECHARGE);
                return "redirect:toChargeAuthorize";
            }
            //错误提示信息
            model.addAttribute("errorMsg", MessageConstant.WRONG_MONEY);
            return "cz";
        }
        model.addAttribute("errorMsg", MessageConstant.LACK_RECHARGE_INFO);
        //充值功能页面，等待前端页面写完
        return "cz";
    }

}
