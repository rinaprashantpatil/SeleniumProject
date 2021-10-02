package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipInteraction {
    @Test
    public void demoTooltipInteraction() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demoqa.com/tooltip-and-double-click/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        Actions act = new Actions(driver);

        WebElement mouseHover =driver.findElement(By.id("tooltipDemo"));

        act.moveToElement(mouseHover).perform();

        WebElement tooltipMsg=driver.findElement(By.xpath("//span[@class='tooltiptext']"));
        System.out.println("Tooltip Message is:"+tooltipMsg.getText());
        Thread.sleep(1000);
        driver.close();
    }
}
