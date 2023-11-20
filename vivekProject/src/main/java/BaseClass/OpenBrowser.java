package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static WebDriver driver;

    public static void navToWebsite(String URL){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

    }
    public static void closeBrowser(){
        driver.close();

    }
    public static void quitBrowser(){
        driver.quit();
    }


}