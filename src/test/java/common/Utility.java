package common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utility {
    public WebDriver driver;
    // when we use parameter through xml file then we have to use @parameters tag from testNG and inside the bracket
    // put parameters name with double code as bellow
    @Parameters("browser")
    @BeforeClass
    public void openingBrowser(String window){
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
    @AfterClass
    public void closingBrowser() {

        driver.close();
    }
    public void pictures() throws IOException {
        Date dt = new Date();
        System.out.println(dt);
        String st = dt.toString().replace(" ","_").replace(":","_");
        System.out.println(st);
        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenShot,new File("C:\\Users\\mrshi\\AutomationWithSalim\\pictures\\"+st+"pictureOfPage.jpg"));
    }
}
