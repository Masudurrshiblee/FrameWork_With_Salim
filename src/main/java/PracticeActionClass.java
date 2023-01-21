import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeActionClass {
    static WebDriver driver; // Here we declare as static because driver is called in static method,
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        //Creating object of action class
        Actions action = new Actions(driver);
        // Now we have to locate the element
        WebElement element = driver.findElement(By.id("nav-link-accountList"));
        action.moveToElement(element).perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
