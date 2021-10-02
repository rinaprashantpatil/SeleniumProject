package ExecuteTestCase;

import PageObjects.AddNewCustomerPage;
import PageObjects.HomePageObject;
import PageObjects.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSite {
    @Test
    public void DemoTestSite()throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/v4/");
        driver.manage().window().maximize();

        //login page automation
        LoginPageObject loginPageObject = new LoginPageObject(driver);
        loginPageObject.setUserID("mgr123");
        loginPageObject.setPassword("mgr!23");
        Thread.sleep(2000);
        loginPageObject.clickOnLogin();

        //home page automation
        HomePageObject homepage = new HomePageObject(driver);
        homepage.clickOnNewCustmerLink();

        //Add new customer page automation
        AddNewCustomerPage addnew= new AddNewCustomerPage(driver);
        addnew.setCustomername("Rina");
        addnew. clickOnGender();



    }
}
