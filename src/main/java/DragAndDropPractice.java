import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {
    static WebDriver driver; // Here we declare as static because driver is called in static method,
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com");
        //driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        WebElement droppable = driver.findElement(By.linkText("Droppable"));
        droppable.click();
        // Switching frame to child
        driver.switchTo().frame(0);
        //To handle the drag and drop we have to switch frame if iframe is presence in the DOM structure
        WebElement elementToDrag= driver.findElement(By.id("draggable"));
        WebElement dropHere= driver.findElement(By.id("droppable"));
        Actions action= new Actions(driver);
        //action.dragAndDrop(elementToDrag,dropHere).build().perform();
        Thread.sleep(4000);
        action.dragAndDrop(elementToDrag,dropHere).perform();
        // Switching back to parent frame when element selecting is done under the iframe
        driver.switchTo().parentFrame();
        WebElement sortable = driver.findElement(By.linkText("Sortable"));
        Thread.sleep(4000);
        sortable.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
