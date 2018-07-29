package pageFactoryPattern;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExplanation {


    WebDriver driver = new ChromeDriver();

    @Test(priority=1)
    public void clickOnLogin(){
        System.out.println("first method");
    }
    @Test(priority=3)
    public void aclickOnLogin(){
        System.out.println("second method");
    }
    @Test(priority=2)
    public void zebra(){
        System.out.println("third method");
    }
}
