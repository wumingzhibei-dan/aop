package com.sdd.aop.aspect;

import com.sdd.aop.service.UserLoginService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthLoginAspect {

    @Autowired
    private UserLoginService userLoginService;

    @Pointcut("@annotation(WebLogin)")
    public void auth() {}

    @Before("auth()")
    public void checkUserInfo(JoinPoint joinPoint) {
//        if ("userName".equals(userName) && "password".equals(password)) {
//            logger.info("User Login Success");
//            return new LoginResult("0000", "Success");
//        } else {
//            return new LoginResult("403", "Login Forbidden");
//        }
        userLoginService.login("userName", "passWord");
    }

}
