package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class KeyBoardMouseAction {
    @Test
    public void demoKeyMouseAction() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement googleSearch = driver.findElement(By.name("q"));

       Actions act = new Actions(driver);


        act.keyDown(googleSearch, Keys.SHIFT)
               .sendKeys("selenium")
                .keyUp(googleSearch,Keys.SHIFT)
                .keyDown(googleSearch,Keys.CONTROL)
                .sendKeys("a")
                .keyDown(googleSearch,Keys.CONTROL)
                .sendKeys("x")
                .keyDown(googleSearch,Keys.CONTROL)
                .sendKeys("v")
                .build()
                .perform();

    }
}