package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(id="email") WebElement eml;
    @FindBy(id = "pass") WebElement pssword;
    @FindBy(linkText = "Forgot password?") WebElement forgotPssWord;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void email(){
        eml.sendKeys("mrshiblee@yahoo.com");
    }
    public void password(){
        pssword.sendKeys("12345");
    }
    public void clickOnForgot(){
        forgotPssWord.click();
    }

}
