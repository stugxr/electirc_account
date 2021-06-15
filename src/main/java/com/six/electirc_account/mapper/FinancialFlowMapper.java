package com.six.electirc_account.mapper;

import com.six.electirc_account.entity.FinancialFlow;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: 流水mapper
 * @Author: stugxr
 * @Date: 2021/6/15 2:47 下午
 * @Version: 1.0
 */
public interface FinancialFlowMapper {
    @Select("select Transfer_Id,Transfer_Name,Transfer_Type,Transfer_Date,Balance,Transfer_State," +
            "Trading_mode,Transfer_amount,Teller_number,Types_currency,Service_Charge,transfer_code " +
            "from financialflow")
    List<FinancialFlow> findByPaging();



}
