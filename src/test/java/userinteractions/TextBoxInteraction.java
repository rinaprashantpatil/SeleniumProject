package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBoxInteraction {
    @Test
    public void demoTextBoxInteraction()throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-message")).sendKeys("Text Box Demo");
        String enteredText = driver.findElement(By.id("user-message")).getText();
        System.out.println(enteredText);
    }
}
