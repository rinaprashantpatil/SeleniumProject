package userinteractions;

import javafx.scene.effect.SepiaTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args)throws Exception{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        String parentWinID= driver.getWindowHandle();
        System.out.println("Parent window id is:"+parentWinID);

        driver.findElement(By.id("windowhandling1")).click();
        Set<String> allWinID = driver.getWindowHandles();
        System.out.println("All win IDs are:");
        for(String allIDs:allWinID){
           System.out.println(allIDs);
       }
       // driver.quit();
    }
}
