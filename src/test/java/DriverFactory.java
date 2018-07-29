import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class DriverFactory {

    WebDriver driver;

    public DriverFactory() {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
