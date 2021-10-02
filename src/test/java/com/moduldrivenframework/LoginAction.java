package com.moduldrivenframework;

import org.openqa.selenium.WebDriver;

public class LoginAction {
    public static void execute(WebDriver driver){
        LoginPage.txtUserName(driver).sendKeys("learnvern@gmail.com");
        LoginPage.btnNext(driver).click();
        LoginPage.txtPassword(driver).sendKeys("learnvern123");
        LoginPage.btnSignIn(driver);

    }
}
