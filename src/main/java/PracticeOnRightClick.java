import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeOnRightClick {
    static WebDriver driver; // Here we declare as static because driver is called in static method,
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
        //driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
        Thread.sleep(4000);
        driver.quit();
    }
}
