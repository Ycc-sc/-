package com.huang.service;

import com.huang.po.User;
import org.springframework.web.bind.annotation.ResponseBody;

public interface UserService {

    //用户登录检查用户名和密码
    User checkUser(String username,String password);
}
