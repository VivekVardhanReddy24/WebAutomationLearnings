package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.XLUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DataDrivenTest {
   public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(dataProvider ="LoginData")
     public void loginTest(String user, String pwd, String exp)
    {
        driver.get("https://admin-demo.nopcommerce.com/login");

         WebElement txtEmail = driver.findElement(By.id("Email"));
         txtEmail.clear();
         txtEmail.sendKeys(user);

         WebElement txtPassword =driver.findElement(By.id("Password"));
         txtPassword.clear();
         txtPassword.sendKeys(pwd);

         driver.findElement(By.xpath("//button[@type='submit']")).click();
         System.out.println(driver.getTitle());
        String exp_title = "Dashboard / nopCommerce administration";
        //Dashboard / nopCommerce administration
        String act_title = driver.getTitle();



       if(exp.equals("Valid"))
        {
            if(exp_title.equals(act_title))
            {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            }
            else {
                Assert.assertTrue(false);
            }
        }
        else if(exp.equals("Invalid"))
        {
            if(exp_title.equals(act_title))
            {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(false);
            }
            else {
                Assert.assertTrue(true);
            }
        }

    }

    @DataProvider(name = "LoginData")
    public String [][] getData() throws IOException {
        /*String loginData[][]=  {

                {"admin@yourstore.com", "admin", "Valid"},
                {"admin@yourstore.com", "adm", "Invalid"},
                {" adm@yourstore.com", "admin", "Invalid"},
                {"adm@yourstore.com", "adm", "Invalid"}
        };*/
//GEt the data from Excel Sheet
        String path =System.getProperty("user.dir") +"/src/main/java/DataFiles/loginData.xlsx";

        XLUtility xlutil = new XLUtility(path);
        int totalrows = xlutil.getRowCount("Sheet1");
        int totalcols = xlutil.getCellCount("Sheet1",1);

        String[][] loginData = new String[totalrows][totalcols];

        for(int i =1;i<=totalrows;i++)
        //Here we ignored the header part in excel whose index is 0, we started from
            //index 1
        {
            for(int j=0;j<totalcols;j++)
            {
                loginData[i-1][j]=xlutil.getCellData("Sheet1",i,j);
                //Array index starts from 0, as we ignored the header and considered 1 as index
                //now we take the index from the point of arrays.
            }
        }


        return loginData;
    }
    @AfterClass
    public static void tearDown()
    {
        driver.close();
    }

}

