import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(6000);
        driver.navigate().forward();
        Thread.sleep(5000);

        // Get current URL we have to save as in variable as bellow
        String ur=driver.getCurrentUrl();
        System.out.println(ur);

        //To check window handle id
       String windowHandle= driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.close();
    }
}
