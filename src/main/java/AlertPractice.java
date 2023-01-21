import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.manage().window().maximize();
        WebElement alert= driver.findElement(By.name("alert"));
        alert.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        WebElement prompting= driver.findElement(By.name("prompt"));
        prompting.click();
        Thread.sleep(4000);
        //To write somthing in alert box
        driver.switchTo().alert().sendKeys("tested");
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        driver.quit();
    }
}
