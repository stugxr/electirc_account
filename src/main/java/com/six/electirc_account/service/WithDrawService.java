package com.six.electirc_account.service;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @Description: 提现服务接口
 * @Author: stugxr
 * @Date: 2021/6/13 12:21 下午
 * @Version: 1.0
 */
public interface WithDrawService {
    /**
     *
     * @Description:提现操作-生成交易流水订单
     * @author gxr
     * @date 2021/6/13 12:23 下午
     * @param bankType 什么银行
     * @param withDrawMoney 提取金额
     * @param session 会话
     * @return void
     */
    void generateFinancialFlow(String bankType, BigDecimal withDrawMoney, HttpSession session);

    /**
     *
     * @Description：根据用户id和银行卡类型，增加该用户该银行卡里面的余额
     * @author gxr
     * @date 2021/6/14 1:54 上午
     * @param withDrawMoney 提取金额
     * @param bankType 银行卡类型
     * @param userId 用户Id
     * @return void
     */
    void addBankBalance(BigDecimal withDrawMoney, String bankType, int userId);

    /**
     *
     * @Description:减少电子账户余额
     * @author gxr
     * @date 2021/6/14 2:19 上午
     * @param withDrawMoney 提取额
     * @param userId 用户Id
     * @return void
     */
    void subElatricAccountMoney(BigDecimal withDrawMoney, int userId);
}
