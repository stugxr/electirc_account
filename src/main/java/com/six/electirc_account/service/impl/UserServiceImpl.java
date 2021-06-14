package com.six.electirc_account.service.impl;

import com.six.electirc_account.constant.UserConstant;
import com.six.electirc_account.entity.User;
import com.six.electirc_account.mapper.UserMapper;
import com.six.electirc_account.service.UserService;
import com.six.electirc_account.util.CookieUtil;
import com.six.electirc_account.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @Description: 用户服务接口实现
 * @Author: gxr
 * @Date: 2021/6/11 3:41 下午
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User checkoutUser(String uname, String pwd) {
        return userMapper.selUserByUnamAndPwd(uname,pwd);
    }

    @Override
    public String getBankCadPwd(int userId,String bankType) {
        return userMapper.selBankCardPwd(userId,bankType);
    }

    @Override
    public void saveEncodeUserInfoToCookie(User user, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //将用户密码进行加密
        String encodeUserInfo = Md5Util.getEncryptedPwd(user.toString());
        //将加密用户信息存入cookie中
        CookieUtil.setCookie(request,response,UserConstant.COOKIE_USER_NAME,encodeUserInfo,60 * 60 * 2,true);
    }


}
