package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDropInteraction {
    @Test
    public void demoDragAndDropInteraction() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demoqa.com/droppable");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);

       // act.dragAndDrop(from,to).perform();
       // act.dragAndDropBy(from,138,24).perform();

        act.clickAndHold(from).moveToElement(to).release().build().perform();

        //Verify message
        WebElement droppedMsg = driver.findElement(By.xpath("//div/p[text()='Dropped!']"));
        if(droppedMsg.isDisplayed()){
            System.out.println("Success");
            System.out.println("Message is:"+droppedMsg.getText());
        }
        else
        {
            System.out.println("Failed");
        }
        Thread.sleep(1000);
        //driver.close();
    }

    }
