package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //get command
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //get title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is:" +title);
        int titlelenght = driver.getTitle().length();
        System.out.println("Lenght of title is:"+titlelenght);

        //get current url command
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("Current url of the page is:"+CurrentUrl);

        //get page source command
        String Pagesource = driver.getPageSource();
        System.out.println("View source of page is:"+Pagesource);
        int sourcelenght = driver.getPageSource().length();
        System.out.println("Lenght of page source is:"+sourcelenght);

        //close command
        driver.close();

        // quit command
        driver.quit();


    }
}
