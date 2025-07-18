package iFrames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class AdidasIframePractice {

    public static void main(String[] args) throws IOException {

        // Step 1: Launch browser
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            // Step 2: Maximize and go to Adidas Store Locator
            driver.manage().window().maximize();
            driver.get("https://www.adidas.com/us/store-locator");

            // Step 3: Wait for iframe to be present
            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));

            // Step 4: Count all iframes
            List<WebElement> allIframes = driver.findElements(By.tagName("iframe"));
            System.out.println("Total iframes found: " + allIframes.size());

            // Step 5: Switch to first iframe (usually Google Maps)
            driver.switchTo().frame(allIframes.get(0));

            // Step 6: Get the alt text from map image inside iframe
            WebElement mapImage = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("img")));
            String mapAlt = mapImage.getAttribute("alt");
            System.out.println("Inside iframe - Map alt text: " + mapAlt);

            // Step 7: Switch back to main content
            driver.switchTo().defaultContent();

            // Step 8: Validate something on main page (like store list)
            WebElement storeListSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("store-locator__results")));
            boolean isDisplayed = storeListSection.isDisplayed();
            System.out.println("Main page - Store list section visible: " + isDisplayed);

            // Step 9: Take a screenshot
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(srcFile, new File("./adidas_iframe_test.png"));
            System.out.println("Screenshot saved as adidas_iframe_test.png");

        } catch (Exception e) {
            System.err.println("❌ Error occurred: " + e.getMessage());
        } finally {
            // Step 10: Close browser
            driver.quit();
        }
    }
}
