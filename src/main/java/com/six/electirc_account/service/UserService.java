package com.six.electirc_account.service;

import com.six.electirc_account.entity.User;

/**
 * @Description: 用户服务接口
 * @Author: stugxr
 * @Date: 2021/6/11 4:28 下午
 * @Version: 1.0
 */
public interface UserService {
    User checkoutUser(String uname, String pwd);
}
