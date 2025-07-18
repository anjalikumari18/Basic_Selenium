package iFrames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class IframePractice {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://qa-automation-practice.netlify.app/iframe");

        Thread.sleep(2000);

        WebElement iframe = driver.findElement(By.tagName("iframe"));

        //Switch to iframe
        // driver.switchTo().frame(iframe);
        // driver.switchTo().frame(0);
          driver.switchTo().frame("iframe-checkboxes");

        //Get text inside iframe
        String headingInIframe = driver.findElement(By.tagName("h1")).getText();
        String paraInIframe = driver.findElement(By.tagName("p")).getText();
        System.out.println(headingInIframe);
        System.out.println(paraInIframe);
        
        driver.switchTo().parentFrame();

        //Get text on main page
        String mainHeading = driver.findElement(By.tagName("h2")).getText();
        System.out.println("Main Page Heading: " + mainHeading);
        
        
        
        
        
        

        
    }
}
