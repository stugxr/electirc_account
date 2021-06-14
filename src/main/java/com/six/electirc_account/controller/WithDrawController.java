package com.six.electirc_account.controller;

import com.six.electirc_account.annotation.LoginRequired;
import com.six.electirc_account.constant.MessageConstant;
import com.six.electirc_account.constant.TransferConstant;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.service.UserService;
import com.six.electirc_account.service.WithDrawService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @RequestMapping(value = "/withDraw",method = RequestMethod.POST)
    @LoginRequired
    public String withDraw(String bankType, BigDecimal withDrawMoney,
                                HttpSession session, Model model) {
        //对银行类型进行验空
        if (StringUtils.isNotBlank(bankType) && withDrawMoney != null ) {
            //查询电子账户余额
            User user = (User)session.getAttribute("user");
            BigDecimal elatricMoney=withDrawService.getElatricMoney(user.getUserId());
            //判断提现金额进是否大于零，而且小于电子账户余额
            if (withDrawMoney.compareTo(new BigDecimal(0)) == 1 && withDrawMoney.compareTo(elatricMoney)==-1) {
                //生成交易订单并保存
                withDrawService.generateFinancialFlow(bankType,withDrawMoney,session);
                //请求用户授权
                session.setAttribute("bankType",bankType);
                session.setAttribute("withDrawMoney",withDrawMoney);
                session.setAttribute("transferType", TransferConstant.TRANSFER_RECHARGE);
                return "redirect:toAuthorize";
            }
            //错误提示信息
            model.addAttribute("errorMsg", MessageConstant.WRONG_MONEY);
            return "tx";
        }
        //错误提示信息
        model.addAttribute("errorMsg", MessageConstant.LACK_WITHDRAW_INFO);
        return "tx";
    }
}
