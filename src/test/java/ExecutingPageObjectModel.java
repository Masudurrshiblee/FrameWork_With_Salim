import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjectModel.ForgotPssWorPage;
import pageObjectModel.HomePage;

import java.io.File;
import java.io.IOException;

public class ExecutingPageObjectModel {
    //Setting up driver
    WebDriver driver;
    @BeforeClass
    public void beforeClassMethod(){
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\msedgedriver.exe");
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\geckodriver.exe");
       //driver = new ChromeDriver();
        driver = new EdgeDriver();
       // driver = new FirefoxDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
@Test(priority = 1)
    public void functionalMethod() throws InterruptedException, IOException {
        //Creating object of HomePage class to access the method from that class
        HomePage hp = new HomePage(driver);
        hp.email();
        hp.password();
        hp.clickOnForgot();

        // Creating object of ForgotPssWord Class
        ForgotPssWorPage fp = new ForgotPssWorPage(driver);
        fp.emailOrMobile();
        fp.clickSearch();
        Thread.sleep(6000);
        // At the bottom two lines of code will help to take screenShot but this not professional way, so if we keep it
        // in seperate method just we need to call that method only
//    File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileHandler.copy(screenShot,new File("C:\\Users\\mrshi\\AutomationWithSalim\\pictures\\pictureOfPage.jpg"));
    }

//    @Test(priority =2)
    // if we want to depend one method to another method use following approach
    //@Test(priority =1 , dependsOnMethod = "method name")
//    public void verifyingText() throws InterruptedException {
//        driver.navigate().back();
//        Thread.sleep(6000);
//        ForgotPssWorPage fp1 = new ForgotPssWorPage(driver);
//        String text = fp1.capturingText();
//        // Assertion using Hard assert
//        Assert.assertEquals(text,"Please enter your email or mobile number to search for your account.");
//        // Assertion Using soft Assert
//        SoftAssert soft = new SoftAssert();
//        soft.assertEquals(text,"Please enter your email or mobile number to search for your account.");
//
//    }
@AfterClass
    public void afterClassMethod(){
        driver.quit();
    }
}
