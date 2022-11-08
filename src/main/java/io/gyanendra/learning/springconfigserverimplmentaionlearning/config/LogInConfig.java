package io.gyanendra.learning.springconfigserverimplmentaionlearning.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-08,Nov,2022
 */
@Configuration
@ConfigurationProperties("auth-demo")
public class LogInConfig {
    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    private String loginUrl;
    private String authUrl;

}
