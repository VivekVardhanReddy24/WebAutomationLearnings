package SeleniumLearnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AT03_XPathLearning {
    @Test
    public void xPath() throws InterruptedException {
    // Setting up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myer.com.au/join");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Finding element by Xpath
        //version 1
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
        // version 2 of xpath
        driver.findElement(By.xpath("//button[contains(@class,' css-1bid82x')]")).click();
        //version 3
        driver.findElement(By.xpath("//input[@id ='password' and @ type ='password']")).sendKeys("password");
        Thread.sleep(10000);
        //version 4
        //scroll down to the element Create Account
        WebElement CreateAccEle= driver.findElement(By.xpath("//*[@class='signup-button css-1bid82x']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CreateAccEle);
        // will stop execution for given timeperiod
        //version-5
        //click on create an account button
        //CreateAccEle.click();
        //or
        driver.findElement(By.xpath("//*[@id='create-account']")).click();
    }

    }

