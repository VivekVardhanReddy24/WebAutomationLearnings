package SeleniumLearnings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class AT07_WebTables {

        public AT07_WebTables() {
        }

        @Test
        public void table() throws IOException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(System.getProperty("user.dir") + "/src/main/java/webtablehtml.html");
            List<WebElement> colcount = driver.findElements(By.xpath("/html/body/table/thead/tr/th"));
            int colSize = colcount.size();
            System.out.println("colSize :" + colSize);
            List<WebElement> rowcount = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
            int rowSize = rowcount.size();
            System.out.println("rowSize :" + rowSize);
            WebElement CellVal = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
            System.out.println("print specific value from cell  : " + CellVal.getText());
            String CellVal1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]")).getText();
            System.out.println("print specific value from cell  : " + CellVal1);
            String sRowVal = "Clock Tower Hotel";
            List<WebElement> HeadCount = driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
            int NumCells = HeadCount.size();
            System.out.println("NumCells  :" + NumCells);
            List<WebElement> row2Count = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
            int Row2Size = row2Count.size();
            System.out.println("Row2Size :" + Row2Size);

            for(int i = 1; i <= NumCells; ++i) {
                String sValue = driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/th")).getText();
                System.out.println("RowHeaderValue is : " + sValue);
                if (sRowVal.equalsIgnoreCase(sValue)) {
                    for(int j = 1; j <= Row2Size; ++j) {
                        String RowValue = driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                        System.out.println("RowValue is : " + RowValue);
                    }

                    return;
                }
            }

        }
    }


