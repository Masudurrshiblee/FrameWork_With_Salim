import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassOnLocator {
    static WebDriver driver; // Here we declare as static because driver is called in static method,
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        // Write something in search Field
        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("Computer");
        // Click on Search Button
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        // Click on a link
//        WebElement linkForNewYearSale = driver.findElement(By.linkText("New Year Sale"));
//        linkForNewYearSale.click();
        //Click on a link using partial linktext locator
        WebElement usingPartialLinktxt = driver.findElement(By.partialLinkText("New Year"));
         usingPartialLinktxt.click();
        // Check number of links are available in the web page
        int numberOfLinks = driver.findElements(By.tagName("a")).size();
        System.out.println("Total number of Links are :" + numberOfLinks);
        Thread.sleep(7000);
        driver.quit();

    }
}
