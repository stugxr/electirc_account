package com.six.electirc_account.controller;

import com.six.electirc_account.entity.FinancialFlow;
import com.six.electirc_account.mapper.FinancialFlowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description: 流水控制层
 * @Author: gxr
 * @Date: 2021/6/15 2:21 下午
 * @Version: 1.0
 */
@Controller
public class FinancialFlowController {
    @Autowired
    FinancialFlowMapper financialFlowMapper;


    @GetMapping("financialRecord")
    public String findByPaging(HttpServletRequest request){
        List<FinancialFlow> data = financialFlowMapper.findByPaging();
        request.setAttribute("data",data);
        return "salary";
    }

}
