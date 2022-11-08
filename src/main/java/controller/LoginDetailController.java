package controller;

import bean.LogingDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By:  Gyanendra_Yadv
 * on 2022-11-08,Nov,2022
 */

@RestController
public class LoginDetailController {
    //Dummy: AuthUrl
    String authUrl = "http://www.facebook.com";
    String login = "http://www.facebook.com/login";

    @GetMapping(value = "/loginDetails")
    public LogingDetails getLoginDetails() {
        return new LogingDetails(login,authUrl);
    }
}
