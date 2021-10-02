package com.moduldrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //WebElement
    static WebElement element = null;

    public static WebElement txtUserName(WebDriver driver) {
        element = driver.findElement(By.id("identifierId"));
        return element;
    }

    public static WebElement txtPassword(WebDriver driver) {
        element = driver.findElement(By.id("Passwd"));
        return element;

    }

    public static WebElement btnNext(WebDriver driver) {
        element = driver.findElement(By.className("VfPpkd-vQzf8d"));
        return element;

    }

    public static WebElement btnSignIn(WebDriver driver) {
        element = driver.findElement(By.id("signIn"));
        return element;

    }

}
