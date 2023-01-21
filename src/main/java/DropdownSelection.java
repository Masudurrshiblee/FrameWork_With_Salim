import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrshi\\AutomationWithSalim\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement createNewAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement birthMonth= driver.findElement(By.name("birthday_month"));
        // To select dropdown we have to create separate object of select class for every single dropdown
        Select dropDown=new Select(birthMonth);
        dropDown.selectByValue("10");
        Thread.sleep(5000);
        WebElement birthday= driver.findElement(By.name("birthday_day"));
        Select dropDown1= new Select(birthday);
        dropDown1.selectByVisibleText("30");
        WebElement birthYear = driver.findElement(By.name("birthday_year"));
        Select dropDown2 =new Select(birthYear);
        dropDown2.selectByVisibleText("2018");
        Thread.sleep(4000);
        driver.quit();
    }
}
