package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipInteractions { @Test
public void demoRadioButtonInteraction() throws Exception {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.automationtestinginsider.com");
    driver.manage().window().maximize();
    Thread.sleep(1000);

    WebElement searchBox = driver.findElement(By.xpath("//input[@class='gsc-input']"));
    String tooltiptext = searchBox.getAttribute("title");
    System.out.println("Tooltip text is:"+tooltiptext);
}
}
