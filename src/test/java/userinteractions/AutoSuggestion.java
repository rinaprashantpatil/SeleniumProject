package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestion {
    @Test
    public void demoKeyMouseAction() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(1000);

        List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='sbct']"));

        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getText());
            String searchText = list.get(i).getText();

            if(searchText.equals("selenium tutorial")){
                list.get(i).click();
                break;
            }
        }
    }
}