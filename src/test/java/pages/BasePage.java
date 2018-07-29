package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BasePage {

    WebDriver driver;


    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.google.com/");
    }

    @Test
    public void searchWithText() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("questions?");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".lsbb .lsb")));
        driver.findElement(By.cssSelector(".lsbb .lsb")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Question - Wikipedia']")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Question - Wikipedia']")).isDisplayed());
    }

    @AfterMethod
    public void destroyDriver(){
        driver.quit();
    }

}
