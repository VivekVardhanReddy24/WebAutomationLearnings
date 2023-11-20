package SeleniumLearnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AT04_Iframes {
    @Test
    public void iframeListSelect(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/signup");
      /* List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
       int IframeCount = iframeList.size();
       System.out.println("IframeCount:" +IframeCount);
        int i = 0;
        if (i < IframeCount) {
            driver.switchTo().frame(i);
            driver.findElement(By.cssSelector("input[id^='firstName']")).sendKeys(new CharSequence[]{"FirstName"});

        }*/

        }
}
