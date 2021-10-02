package com.moduldrivenframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MianModule {
    static WebDriver driver=null;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.gmail.com");
        LoginAction.execute(driver);
    }
}
