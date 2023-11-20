package SeleniumLearnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AT05_NavigateBack {

    @Test
    public void NavToFro() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://echoecho.com/");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//big/a[contains(text(),'Tutorials')]")).click();
        Thread.sleep(5000L);
        driver.navigate().back();
        Thread.sleep(5000L);
        driver.navigate().refresh();
        Thread.sleep(5000L);
        driver.navigate().forward();
    }
}