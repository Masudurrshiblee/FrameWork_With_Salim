import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BrowserSetUp {
    WebDriver driver;
    @Test
    public void findingElement(){
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Toys");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
    }
    @BeforeClass
    public void beforeClass() throws IOException {
        // This is normal way to open a browser
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32" +
//                " (5)\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.navigate().to("https://www.amazon.com");
//        driver.manage().window().maximize();

        // The following approach is to handle multiple browser

        //browser("chrome"); // if we want to open chrome
        browser("Edge");   // if we want to open Edge
//        browser("Firefox");  // if we want to open Firefox

        // Calling pictures method to take screenShot
        pictures();
    }
    @AfterClass
    public void afterClass(){

        driver.close();
    }
    public void browser(String window){
        if(window.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to("https://www.amazon.com");
            driver.manage().window().maximize();
        }else if(window.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.navigate().to("https://www.amazon.com");
            driver.manage().window().maximize();
        }else if (window.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.navigate().to("https://www.amazon.com");
            driver.manage().window().maximize();
        }
    }
    // This method will help to take screenshot
    public void pictures() throws IOException {
        Date dt = new Date();
        System.out.println(dt);
        String st = dt.toString().replace(" ","_").replace(":","_");
        System.out.println(st);
        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenShot,new File("C:\\Users\\mrshi\\AutomationWithSalim\\pictures\\"+st+"pictureOfPage.jpg"));
    }
}
