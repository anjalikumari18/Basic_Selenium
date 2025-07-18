package ActionsClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ToHandleDisabledElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");

        // Clicking to expand the download link section
        driver.findElement(By.linkText("jdk-23.0.2_doc-all.zip")).click();

        // Handled the Disabled element
        WebElement disabledEle = driver.findElement(By.linkText("Download jdk-23.0.2_doc-all.zip"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", disabledEle);

        Thread.sleep(5000);
        driver.quit();
    }
}
