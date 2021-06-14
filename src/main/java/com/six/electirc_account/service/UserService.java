package com.six.electirc_account.service;

import com.six.electirc_account.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @Description: 用户服务接口
 * @Author: stugxr
 * @Date: 2021/6/11 4:28 下午
 * @Version: 1.0
 */
public interface UserService {
    /**
     *
     * @Description:根据用户名和密码查询用户信息
     * @author gxr
     * @date 2021/6/14 3:23 上午
     * @param uname
     * @param pwd
     * @return com.six.electirc_account.entity.User
     */
    User checkoutUser(String uname, String pwd);

    /**
     *
     * @Description:根据用id获取银行卡密码
     * @author gxr
     * @date 2021/6/13 6:26 下午
     * @param userId
     * @return java.lang.String
     */
    String getBankCadPwd(int userId);

    /**
     *
     * @Description:将用户信息进行加密并存入cookie
     * @author gxr
     * @date 2021/6/14 11:20 上午
     * @param user 用户信息
     * @return void
     */
    void saveEncodeUserInfoToCookie(User user, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
