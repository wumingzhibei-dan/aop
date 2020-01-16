package com.sdd.aop.service;

import com.sdd.common.bean.LoginResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    private static final Logger logger = LoggerFactory.getLogger(UserLoginService.class);


    public LoginResult login(String userName, String password) {
        if ("userName".equals(userName) && "password".equals(password)) {
            logger.info("User Login Success");
            return new LoginResult("0000", "Success");
        } else {
            logger.info("User Login Faild");
            return new LoginResult("403", "Login Forbidden");
        }
    }
}
