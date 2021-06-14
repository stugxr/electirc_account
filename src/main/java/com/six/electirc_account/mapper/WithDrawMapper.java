package com.six.electirc_account.mapper;

import com.six.electirc_account.entity.FinancialFlow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * @Description: 提现mapper
 * @Author: stugxr
 * @Date: 2021/6/13 12:54 下午
 * @Version: 1.0
 */
public interface WithDrawMapper {
    /**
     *
     * @Description:根据用户id查询银行卡余额
     * @author gxr
     * @date 2021/6/13 12:57 下午
     * @param * @param userId
     * @return java.math.BigDecimal
     */
    @Select("select back_money from bankaccount where user_id=#{userId} and bank_type=#{bankType}")
    BigDecimal selBankBalance(@Param("userId") int userId,@Param("bankType") String bankType);

    /**
     *
     * @Description:保存流水订单
     * @author gxr
     * @date 2021/6/13 1:42 下午
      @param financialFlow 需要保存的流水订单信息
     * @return void
     */
    @Insert("insert into financialflow(user_id,Transfer_Name,Transfer_Type,Transfer_Date,Remarks,Balance,Transfer_State,Trading_mode," +
            "Transfer_amount,Teller_number,Types_currency,enjambment,Customer_level,Service_Charge,transfer_code) " +
            "value(#{userId},#{transferName},#{transferType},#{transferDate},#{remarks},#{balance},#{transferState},#{tradingMode},#{transferAmount}" +
            ",#{tellerNumber},#{typesCurrency},#{enjambment},#{customerLevel},#{serviceCharge},#{transferCode})")
    void insFinancialFlowOrder(FinancialFlow financialFlow);

    /**
     * @Description:更新该用户该银行的余额
     * @author gxr
     * @date 2021/6/14 1:59 上午
     * @param dealBankMoney
     * @param bankType
     * @param userId
     * @return void
     */
    @Update("update bankaccount set back_money=#{withDrawMoney} where user_id=#{userId} and bank_type=#{bankType}")
    void updBalance(@Param("withDrawMoney") BigDecimal dealBankMoney, @Param("bankType") String bankType, @Param("userId") int userId);

    /**
     *
     * @Description:根据userId查询电子账户余额
     * @author gxr
     * @date 2021/6/14 2:22 上午
     * @param userId 用户Id
     * @return void
     */
    @Select("select zero_money from electronicaccount where user_id=#{userId}")
    BigDecimal selElatricMoney(int userId);

    /**
     *
     * @Description:更新电子账户余额
     * @author gxr
     * @date 2021/6/14 2:30 上午
     * @param * @param dealElatricMoney
     * @return void
     */
    @Update("update electronicaccount set zero_money=#{dealElatricMoney} where user_id=#{userId}")
    void updElatricMoney(@Param("dealElatricMoney") BigDecimal dealElatricMoney,int userId);
}
