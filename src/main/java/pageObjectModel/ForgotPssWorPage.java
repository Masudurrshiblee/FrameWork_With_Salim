package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPssWorPage {

    WebDriver driver;
    @FindBy(id="identify_email") WebElement forgotPass;
    @FindBy(name = "did_submit") WebElement search;
    @FindBy(xpath = "//*[contains(text(),'Please enter your email or mobile number to search for your account.')]")
    WebElement checkingText;

    // Creating Constructor of this class
    public ForgotPssWorPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

        // Now Creating method for above locator

    }
    public void emailOrMobile(){
        forgotPass.sendKeys("mrshiblee21@yahoo.com");
    }
    public void clickSearch(){
        search.click();
    }
    public String capturingText(){
        //checkingText.getText();
        // Now storing the text value
        String text = checkingText.getText();
        return text;
    }
}
