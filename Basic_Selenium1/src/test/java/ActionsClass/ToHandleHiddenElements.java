// Test case:
// 1. Navigate to Facebook Sign up page
// 2. Handle the Hidden Text field without clicking on custom radio button
package ActionsClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ToHandleHiddenElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.facebook.com/r.php?entry_point=login");

        // Handle the hidden element
        WebElement hiddenEle = driver.findElement(By.id("custom_gender"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='Prefer Not To Specify'", hiddenEle);

        Thread.sleep(5000);
        //driver.quit();
    }
}
