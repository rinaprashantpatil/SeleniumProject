package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxinteraction {
    @Test
    public void demoCheckBoxInteraction()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
        driver.manage().window().maximize();


    }
}