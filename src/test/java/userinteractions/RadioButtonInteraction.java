package userinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class RadioButtonInteraction {
    @Test
    public void demoRadioButtonInteraction()throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        driver.manage().window().maximize();
        WebElement radioElement = driver.findElement(By.name("gender"));
        if(radioElement.isDisplayed() && radioElement.isEnabled() && !radioElement.isSelected()){
            radioElement.click();

        }
        //select the radio button with age group 5 to 15
       List<WebElement> radioElements =driver.findElements(By.name("ageGroup"));
        if(radioElements.size()>0){
            for(int i=0;i<radioElements.size();i++){
                String ageGroup = radioElements.get(i).getAttribute("value");
                if(ageGroup.equals("5-15")){
                    radioElements.get(i).click();
                    System.out.println("Selected the required age group");
                    break;
                }
            }
      }
    }
}
