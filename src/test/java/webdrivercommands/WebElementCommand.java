package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //get command
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //SendKeys command
        driver.findElement(By.name("email")).sendKeys("Prashant");
        driver.findElement(By.id("pass")).sendKeys("17764753");

        //click command
        driver.findElement(By.id("u_0_d_vn")).click();

        //isDisplayed command
         boolean b1 = driver.findElement(By.id("u_0_d_vn")).isDisplayed();
         System.out.println("b1");// true

        //isEnabled command
        boolean b2 = driver.findElement(By.id("u_0_d_vn")).isEnabled();
        System.out.println("b2");// false

        driver.navigate().to("https://www.freecrm.com/register/");
        //isSelected command



    }
}
