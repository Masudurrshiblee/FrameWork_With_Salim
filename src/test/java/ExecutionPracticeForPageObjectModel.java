import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import practice1PageObjectModel.ForgotPasswordPagePractice1;
import practice1PageObjectModel.HomePagePractice1;

public class ExecutionPracticeForPageObjectModel {
    WebDriver driver;
@BeforeClass
    public void beforeClassMethod1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
}
@Test
    public void forgotPasswordMethod() throws InterruptedException {
        HomePagePractice1 hp1= new HomePagePractice1(driver);
        hp1.forgotPasswordMethod();
        Thread.sleep(5000);
    }
//    @Test(priority = 2)
//    public void forText(){
//        ForgotPasswordPagePractice1 fp1 = new ForgotPasswordPagePractice1(driver);
//        String texts = fp1.findingTextMethod();
//        // Here actual is what i am getting through the coding
//        Assert.assertEquals(texts,"Please enter your email or mobile number to search for your account");
//    }
@AfterClass
    public void afterClassMethod(){
        driver.quit();
    }
}
