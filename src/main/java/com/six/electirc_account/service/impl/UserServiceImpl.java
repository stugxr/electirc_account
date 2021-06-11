package com.six.electirc_account.service.impl;

import com.six.electirc_account.entity.User;
import com.six.electirc_account.mapper.UserMapper;
import com.six.electirc_account.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户服务接口实现
 * @Author: stugxr
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
}
