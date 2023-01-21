import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class LearningWindowHandles {
    static WebDriver driver; // Here we declare as static because driver is called in static method,
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("New Year Sale"));
        action.keyDown(Keys.SHIFT).build().perform();
        element.click();
        action.keyUp(Keys.SHIFT).build().perform();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String secondWindow = iterator.next();
        // To work on second window we have to switch window as bellow
        driver.switchTo().window(secondWindow);
        WebElement ele = driver.findElement(By.xpath("(//*[@class='nav-a-content'])[1]"));
        Thread.sleep(5000);
        ele.click();
        // Switching back to parent window as bellow
        driver.switchTo().window(parentWindow);
    }
}
