package com.sdd.aop.controller;

import com.sdd.aop.aspect.WebLogin;
import com.sdd.aop.service.UserLoginService;
import com.sdd.common.bean.LoginResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wumingzhibei")
public class UserLoginController {
    private static final Logger logger = LoggerFactory.getLogger(UserLoginController.class);

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "login", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @WebLogin
    public LoginResult login(@RequestParam(value = "user_name") String username,
                             @RequestParam(value = "password") String password) {
        logger.info("Enter login controller.");
        return null;
    }
}
