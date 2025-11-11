package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class printOnlyOneCol {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/web-table-element.php");

        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        System.out.println("Third Column (Current Price):");
        for(WebElement row : rows){
            List<WebElement> cols = row.findElements(By.tagName("td"));
            if(cols.size() > 2){
                System.out.println(cols.get(2).getText());
            }
        }

        driver.quit();
    }
}
