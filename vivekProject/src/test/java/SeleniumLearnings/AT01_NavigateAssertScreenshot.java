package SeleniumLearnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class AT01_NavigateAssertScreenshot {
@Test

    public void navigation() throws IOException {
// chrome driver setup
    WebDriverManager.chromedriver().setup();
    // Open chrome browser
    WebDriver webdriver = new ChromeDriver();

   // Maximise Browser Window
    webdriver.manage().window().maximize();

    //Navigate to a Website
webdriver.get("https://www.thegoodguys.com.au/");
    //get title of the page
    String ActualTitle = webdriver.getTitle();
    System.out.println("Actual title is "+ActualTitle);
    String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
    //Assertion version-1
    Assert.assertEquals(ExpectedTitle,ActualTitle);
    //Assertion version-2
    Assert.assertTrue(ActualTitle.contains("The Good Guys - Online Electrical & Home Appliances"));

    File screenshotFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile, new File(new File(System.getProperty("user.dir")) + "\\src\\test\\java\\screenshots\\automation1.jpeg"));
}
}
