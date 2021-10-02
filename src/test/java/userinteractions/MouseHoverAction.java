package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverAction {

    @Test
    public void demoKeyMouseAction() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php?redirect_to=https%3A%2F%2Fs1.demo.opensourcecms.com%2Fwordpress%2Fwp-admin%2F&reauth=1");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        Actions act = new Actions(driver);

        driver.findElement(By.id("user_login")).sendKeys("rina1234");
        driver.findElement(By.id("user_pass")).sendKeys("rina1234");
        driver.findElement(By.id("wp-submit")).click();

        WebElement logoutOpti0n =driver.findElement(By.xpath("//a[text()='Howdy,']"));
        act.moveToElement(logoutOpti0n).perform();

        driver.findElement(By.xpath("//a[@class='ab-item'][text()='Log Out']")).click();

        Thread.sleep(1000);
        driver.close();



    }
}
