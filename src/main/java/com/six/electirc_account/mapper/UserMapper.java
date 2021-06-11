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
    @Select("select uname,pwd from sz_user where uname=#{uname} and pwd=#{pwd}")
    User selUserByUnamAndPwd(@Param("uname") String uname, @Param("pwd")String pwd);
}
