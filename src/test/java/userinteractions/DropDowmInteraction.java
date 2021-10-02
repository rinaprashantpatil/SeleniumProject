package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDowmInteraction {
    @Test
    public void demoRadioButtonInteraction() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //  Select dropdownByValue = new Select(driver.findElement(By.id("country")));
        //dropdownByValue.selectByValue("India");

       Select dropdownByIndex = new Select(driver.findElement(By.id("country")));
       dropdownByIndex.selectByIndex(2);

       //Getting and Printing all the drop down Items on Consoles
       List<WebElement> ListItems = dropdownByIndex.getOptions();
       for(WebElement element : ListItems) {
           System.out.println(element.getText());
       }




    }

}