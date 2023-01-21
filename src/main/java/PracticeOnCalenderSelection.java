import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOnCalenderSelection {
    static WebDriver driver; // Here we declare as static because driver is called in static method,
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.expedia.com/");
        //driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        WebElement checkIn= driver.findElement(By.id("d1-btn"));
        checkIn.click();
        WebElement departpureDate= driver.findElement(By.xpath("//*[@aria-label='Jan 20, 2023']"));
        departpureDate.click();
        Thread.sleep(3000);
        WebElement returnDate = driver.findElement(By.xpath("//*[@aria-label='Jan 27, 2023']"));
        returnDate.click();
        Thread.sleep(3000);
        WebElement doneButton= driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
        doneButton.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
