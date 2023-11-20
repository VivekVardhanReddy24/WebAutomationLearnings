package SeleniumLearnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT02_Locators {
    @Test
    public void locatorsScreen() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thegoodguys.com.au/");
        /*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //By Id
        driver.findElement(By.id("regAddForm_firstName")).sendKeys("Vivek");
        driver.findElement(By.id("regAddForm_lastName")).sendKeys("Sama");*/

        Thread.sleep(5000);
        //By Partial Link Text
        //driver.findElement(By.partialLinkText("Cata")).click();
        List<WebElement> links
                = driver.findElements(By.tagName("a"));

        // Iterating through all the Links and printing link
        // text
        for (WebElement link : links) {
            System.out.println(link.getText());
        }



    }
}
