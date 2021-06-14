package com.six.electirc_account.service.impl;

import com.six.electirc_account.constant.TransferConstant;
import com.six.electirc_account.entity.FinancialFlow;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.mapper.WithDrawMapper;
import com.six.electirc_account.service.WithDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @Description: 提现服务实现类
 * @Author: gxr
 * @Date: 2021/6/13 12:25 下午
 * @Version: 1.0
 */
@Service
public class WithDrawServiceImpl implements WithDrawService {
    @Autowired
    WithDrawMapper withDrawMapper;

    @Override
    public void generateFinancialFlow(String bankType, BigDecimal withDrawMoney, HttpSession session) {

        User user=(User)session.getAttribute("user");
        //设置流水号属性值
        FinancialFlow financialFlow = new FinancialFlow();
        //生成交易单号
        financialFlow.setTransferCode(UUID.randomUUID().toString());
        //用户id
        financialFlow.setUserId(user.getUserId());
        //客户姓名
        financialFlow.setTransferName(user.getUserName());
        //交易类型类型
        financialFlow.setTransferType(TransferConstant.TRANSFER_WITHDRAW);
        //交易时间
        financialFlow.setTransferDate(new Timestamp(System.currentTimeMillis()));
        //交易渠道
        financialFlow.setTradingMode(TransferConstant.TRADING_MODE);
        //交易金额
        financialFlow.setTransferAmount(withDrawMoney);
        //查询银行卡余额
        BigDecimal balance = withDrawMapper.selBankBalance(user.getUserId(),bankType);
        financialFlow.setBalance(balance);
        //备注
        financialFlow.setRemarks(TransferConstant.REMARK_WITHDRAW_ONE);
        //交易状态
        financialFlow.setTransferState(TransferConstant.TRANSFER_SUCCESS_STATUS);
        //柜员号
        financialFlow.setTellerNumber(TransferConstant.TELLER_NO_ONE);
        //货币种类
        financialFlow.setTypesCurrency(TransferConstant.TRANSFER_MONEY_TYPE);
        //同行跨行转账
        financialFlow.setEnjambment(TransferConstant.NOT_ENJAMBMENT);
        //客户等级
        financialFlow.setCustomerLevel(TransferConstant.NORMAL_CUSTOMER);
        //手续费
        financialFlow.setServiceCharge(TransferConstant.NONE_SERVICE_CHARGE);

        //保存流水订单
        withDrawMapper.insFinancialFlowOrder(financialFlow);
    }

    @Override
    public void addBankBalance(BigDecimal withDrawMoney, String bankType, int userId) {
        //根据用户id和银行卡类型查询余额
        BigDecimal bankMoney = withDrawMapper.selBankBalance(userId, bankType);
        if(bankMoney!=null){
            //银行卡金额进行增加
            BigDecimal dealBankMoney=bankMoney.add(withDrawMoney);
            //更新数据库
            withDrawMapper.updBalance(dealBankMoney,bankType,userId);
        }

    }

    @Override
    public void subElatricAccountMoney(BigDecimal withDrawMoney, int userId) {
        //根据userId查询电子账户余额
        BigDecimal elatricMoney=withDrawMapper.selElatricMoney(userId);
        if(elatricMoney!=null){
            //电子账户余额减少
            BigDecimal dealElatricMoney = elatricMoney.subtract(withDrawMoney);
            //更新数据库
            withDrawMapper.updElatricMoney(dealElatricMoney,userId);
        }
    }
}
