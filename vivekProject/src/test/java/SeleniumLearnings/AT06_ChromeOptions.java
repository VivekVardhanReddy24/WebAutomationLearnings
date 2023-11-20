package SeleniumLearnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AT06_ChromeOptions {
    @Test
    public void ChromeOpt() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(new String[]{"--start-maximized"});
        chromeOptions.addArguments(new String[]{"--ignore-certificate-errors"});
        chromeOptions.addArguments(new String[]{"--disable-popup-blocking"});
        chromeOptions.addArguments(new String[]{"--headless"});
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.myer.com.au/join");
    }
}
