package io.gyanendra.learning.springconfigserverimplmentaionlearning.controller;

import io.gyanendra.learning.springconfigserverimplmentaionlearning.bean.LogingDetails;
import io.gyanendra.learning.springconfigserverimplmentaionlearning.config.LogInConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By:  Gyanendra_Yadv
 * on 2022-11-08,Nov,2022
 */

@RestController
public class LoginDetailController {
    //Dummy: AuthUrl
    @Autowired
    LogInConfig logInConfig;

    @GetMapping(value = "/loginDetails")
    public LogingDetails getLoginDetails() {
        return new LogingDetails(logInConfig.getLoginUrl(),logInConfig.getAuthUrl());
    }
}
