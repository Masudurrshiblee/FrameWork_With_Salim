import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTypesOfXPath {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        // Find Element using Relative x-path
        WebElement searchField = driver.findElement(By.xpath("//input[@dir='auto']"));
        searchField.sendKeys("Wallet");
        // Find element Using absolute X-path
        WebElement abs= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
        abs.click();
        WebElement newrelease = driver.findElement(By.xpath("//a[text()='New Releases']"));
        newrelease.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
