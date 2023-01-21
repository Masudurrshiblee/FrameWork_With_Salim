package practice1PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePractice1 {
WebDriver driver;
@FindBy(linkText = "Forgot password?") WebElement forgotpassword;

public HomePagePractice1(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

public void forgotPasswordMethod() {

    forgotpassword.click();
}
}
