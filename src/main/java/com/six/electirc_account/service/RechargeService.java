package com.six.electirc_account.service;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

public interface RechargeService {
    //充值操作生成流水单
    void generateFinancialFlow(String bankType, BigDecimal rechargeMoney, BigDecimal bankMoney,HttpSession session);
    //减少银行卡余额
    void reduceBankBalance(BigDecimal rechargeMoney, String bankType, int userId);
    //增加电子账户余额
    void addAccountMoney(BigDecimal rechargeMoney, int userId);

    /**
     *
     * @Description:根据userId和bankType获取银行卡里的钱
     * @author lhb
     * @date 2021/6/14 8:28 下午
     * @param userId
     * @param bankType
     * @return java.math.BigDecimal
     */
    BigDecimal getBankMoney(int userId, String bankType);
}
