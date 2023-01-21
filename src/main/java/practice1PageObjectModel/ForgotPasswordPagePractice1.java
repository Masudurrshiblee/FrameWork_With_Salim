package practice1PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPagePractice1 {
    WebDriver driver;
    @FindBy(xpath = "//*[contains(text(),'Please enter your email or mobile number to search for your account.')]")
    WebElement findindText;

    public ForgotPasswordPagePractice1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String findingTextMethod(){
        String texts = findindText.getText();
        return texts;
    }
}
