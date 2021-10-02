package userinteractions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlertInteraction {
    public static void main(String[] args)throws Exception{
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
        Thread.sleep(1000);

        driver.findElement(By.id("promptAlert")).click();

        Alert alert = driver.switchTo().alert();

        String alertText=alert.getText();
        System.out.println("Alert text is:"+alertText);
        alert.sendKeys("Yes");

        Thread.sleep(1000);
        alert.accept();

    }

}
