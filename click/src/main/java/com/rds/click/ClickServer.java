package com.rds.click;

/**
 *
 * @author Gadi
 */
public class ClickServer {

    private String host;
    private String userName;
    private String password;

    public ClickServer() {
    }

    public String isAlive() {
        return "true";
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

}
