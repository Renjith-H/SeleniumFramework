package com.renjith.pages;

import org.openqa.selenium.By;

import static com.renjith.utils.CommonUtils.*;

public class LoginPage {
    private static final By TXTBOX_USERNAME = By.name("username");
    private static final By TXTBOX_PASSWORD = By.name("password");
    private static final By BTN_LOGIN = By.xpath("//*[@type='submit']");

    private LoginPage setUsername(String username){
        setText(TXTBOX_USERNAME, username, "User name"); // we are using static import so we do not nee to use CommonUtils.setText() here
        return this;
    }

    private LoginPage setPassword(String password){
        setText(TXTBOX_PASSWORD, password, "Password");
        return this;
    }

    private HomePage clickLogin(){
        click(BTN_LOGIN, "Login button");
        return new HomePage(); //page chaining
    }

    public HomePage loginToApplication(String username, String password){
        return setUsername(username).setPassword(password).clickLogin();
    }
}
