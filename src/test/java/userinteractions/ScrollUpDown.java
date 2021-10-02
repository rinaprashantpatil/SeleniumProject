package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScrollUpDown {

    // How to scroll up and down a page in selenium

    @Test
    public void demoScrollUDown() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Scroll up or down by pixel

       // driver.get("https://www.automationtestinginsider.com/");
      //  Thread.sleep(1000);
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(1000,4000)");

        //scroll down by visibility of element

        //  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
      //    Thread.sleep(1000);
      //   JavascriptExecutor js = (JavascriptExecutor) driver;
      // WebElement ele= driver.findElement(By.id("simpleAlert"));
      //  js.executeScript("arguments[0].scrollIntoView()",ele);

        //scroll down by end of the page

        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


    }
}