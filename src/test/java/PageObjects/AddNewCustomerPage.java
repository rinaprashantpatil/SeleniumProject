package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
    public AddNewCustomerPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "name")
    WebElement customername;

    @FindBy(name = "rad1")
    WebElement gender;

    public  void setCustomername(String custname){
        customername.sendKeys(custname);
    }
    public void clickOnGender(){
        if(gender.isDisplayed() && gender.isEnabled() && !gender.isSelected()) {
            gender.click();
        }
    }
}
