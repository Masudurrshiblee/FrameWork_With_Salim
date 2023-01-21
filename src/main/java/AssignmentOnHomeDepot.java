import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnHomeDepot {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.navigate().to("https://www.homedepot.com/");
   driver.manage().window().maximize();
        WebElement myAccount= driver.findElement(By.xpath("(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
        myAccount.click();
        Thread.sleep(3000);
        WebElement signIn = driver.findElement(By.xpath("(//*[@class='bttn__content'])[2]"));
        signIn.click();
        WebElement createAccount= driver.findElement(By.xpath("(//span[@Class='bttn__content'])[2]"));
        createAccount.click();
        Thread.sleep(3000);
        WebElement selectAndContinue = driver.findElement(By.xpath("(//span[@Class='bttn__content'])[1]"));
        selectAndContinue.click();
        WebElement forEmail = driver.findElement(By.id("email"));
        forEmail.sendKeys("mrshiblee@yahoo.com");
        WebElement forPassword = driver.findElement(By.id("password-input-field"));
        forPassword.sendKeys("Shiblee1234@");
        WebElement forZipCode = driver.findElement(By.id("zipCode"));
        forZipCode.sendKeys("19020");
        WebElement forPhone = driver.findElement(By.id("phone"));
        forPhone.sendKeys("2675865566");
        WebElement firstCheckBox = driver.findElement(By.xpath("(//*[@Class='checkbox-btn__label-test u__text-align--left'])[1]"));
        firstCheckBox.click();
        WebElement secondCheckBox = driver.findElement(By.xpath("(//*[@Class='checkbox-btn__label-test u__text-align--left'])[2]"));
        secondCheckBox.click();
        WebElement checkcapcha = driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-border']"));
        checkcapcha.click();
        driver.switchTo().alert().dismiss();
        WebElement finalClick = driver.findElement(By.xpath("//*[@Class='bttn__content']"));
        finalClick.click();

//   driver.quit();
    }
}
