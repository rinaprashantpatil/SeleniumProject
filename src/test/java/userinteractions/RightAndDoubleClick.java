package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightAndDoubleClick {

    //How to perform right and double click

    @Test
    public void demoRightAndDoubleClick() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        Actions act = new Actions(driver);

        act.doubleClick(doubleClickBtn).perform();
    }
}