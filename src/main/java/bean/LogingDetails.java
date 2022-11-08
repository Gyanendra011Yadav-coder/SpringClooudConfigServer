package bean;

/**
 * Created By:  Gyanendra_Yadv
 * on 2022-11-08,Nov,2022
 */
public class LogingDetails {
    private String loginUrl;
    private String authUrl;

    public LogingDetails(String loginUrl, String authUrl){
        this.loginUrl = loginUrl;
        this.authUrl = authUrl;
    }

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
}
