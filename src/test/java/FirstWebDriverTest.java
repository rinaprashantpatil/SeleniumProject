import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class FirstWebDriverTest {
    @Test
    public void verifyLabel(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.id("user-message")).sendKeys("First WebDriverTest");
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        String text=driver.findElement(By.id("display")).getText();
        if(text.equalsIgnoreCase("First WebDriver Test")) {
            System.out.println("Test Pass");
        }
        else{
            System.out.println("Test Fail");
        }

    }
}
