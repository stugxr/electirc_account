package com.six.electirc_account.mapper;

import com.six.electirc_account.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Description: 用户持久层接口
 * @Author: stugxr
 * @Date: 2021/6/11 3:45 下午
 * @Version: 1.0
 */
public interface UserMapper {
    @Select("select user_id,user_name,user_password from user where user_name=#{uname} and user_password=#{pwd}")
    User selUserByUnamAndPwd(@Param("uname") String uname, @Param("pwd")String pwd);

    /**
     *
     * @Description:根据bankId获取银行卡密码
     * @author gxr
     * @date 2021/6/13 6:29 下午
     * @param * @param userId
     * @return java.lang.String
     */
    @Select("select bank_pwd from bankaccount where user_id=#{userId} and bank_type=#{bankType}")
    String selBankCardPwd(int userId,String bankType);
}
