package CuraHealthCareAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateAssert {
    @Test
    public void navigate() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String ActualTitle = driver.getTitle();
        System.out.println("ActualTitle : " + ActualTitle);
        String ExpectedTitle = "CURA Healthcare Service";
        //driver.findElement(By.xpath())
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir") + "\\src\\test\\java\\CuraHealthCareAutomation\\screenshots\\Navigation1.jpeg"));

        driver.findElement(By.xpath("//*[@id='btn-make-appointment']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='txt-username' and @name='username' ]")).sendKeys("John Doe");
       // driver.findElement(By.xpath())
        driver.findElement(By.xpath("//input[@id ='txt-password' and@name ='password']")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//button[contains(@class, 'btn btn-default')]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//select[@id='combo_facility' and @name='facility']")).click();
        Thread.sleep(2000);

        List<WebElement> options = driver.findElements(By.xpath("//select[@id ='combo_facility' and @name='facility']"));


        for (WebElement opt : options) {

            if (opt.getText().equals("Tokyo CURA Healthcare Center")) {

                opt.click();

            }

        }
      WebElement Checkbox =  driver.findElement(By.xpath("//input[@id ='chk_hospotal_readmission' and @name ='hospital_readmission']"));
        Checkbox.click();

        List<WebElement> ListOfRadiobtns=driver.findElements(By.name("programs"));
        // count
        int Size= ListOfRadiobtns.size();
        //System.out.println("ListOfRadiobtns : " + Radiobtns);
        for(int i=0;i<Size;i++) {
            String radiobtnName = ListOfRadiobtns.get(i).getAttribute("value");
            System.out.println("Radiobuttons : " +radiobtnName);
            if (radiobtnName.equalsIgnoreCase("medicaid")) {
                ListOfRadiobtns.get(i).click();
                break;
            }
        }
        WebElement date = driver.findElement(By.xpath("//input[@type='text' and @id='txt_visit_date']"));
        date.sendKeys("08-11-2023");
        WebElement textBox = driver.findElement(By.xpath("//textarea[@id='txt_comment' and @placeholder='Comment']"));
        textBox.sendKeys("Looking for General Health Examination");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id ='btn-book-appointment' and @type='submit']")).click();
        WebElement navigation = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
        navigation.click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("History")).click();
        Thread.sleep(3000);

        File HistoryScreenshot = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(HistoryScreenshot, new File(System.getProperty("user.dir") + "\\src\\test\\java\\CuraHealthCareAutomation\\screenshots\\History.jpeg"));
        driver.findElement(By.cssSelector("a[id='menu-toggle']")).click();;
        driver.findElement(By.cssSelector("a[href='authenticate.php?logout']")).click();
        driver.close();


    }
}
