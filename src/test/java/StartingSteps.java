import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class StartingSteps {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new DriverFactory().getDriver();
        driver.get("https://www.google.co.in");
    }

    @BeforeMethod
    public void destroy(){
        driver.quit();
    }
}
