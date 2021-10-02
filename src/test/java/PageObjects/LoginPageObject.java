package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObject {
      public LoginPageObject(WebDriver driver) {
          PageFactory.initElements(driver, this);
      }
    @FindBy(name = "uid")
    public WebElement txtUserId;

   @FindBy(name = "password")
    public WebElement txtPassword;

   @FindBy(name = "btnLogin")
    public WebElement btnLogin;

   @FindBy(name = "btnReset")
    public WebElement btnReset;

   public void setUserID(String userID){
       txtUserId.sendKeys(userID);
   }
    public void setPassword(String password){
       txtPassword.sendKeys(password);
    }
    public void clickOnLogin(){
        btnLogin.click();
    }



}
