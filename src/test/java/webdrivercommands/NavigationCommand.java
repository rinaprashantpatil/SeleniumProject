package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //get command
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //to command
        driver.navigate().to("http://www.amazon.in/");

        //forward command
        driver.navigate().forward();

        //back command
        driver.navigate().back();

        //refresh command
        driver.navigate().refresh();


    }
}
