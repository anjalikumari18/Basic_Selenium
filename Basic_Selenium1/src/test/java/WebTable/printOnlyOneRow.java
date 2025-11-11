package WebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class printOnlyOneRow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/web-table-element.php");

        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // to Print 3rd row 
        WebElement thirdRow = rows.get(3);
        System.out.println("Third Row Data: " + thirdRow.getText());

        driver.quit();
    }
}