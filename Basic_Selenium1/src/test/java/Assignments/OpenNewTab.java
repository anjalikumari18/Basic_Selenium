package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.Var;

public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // Open first tab
		        driver.get("https://www.google.com");

		          // Open new tab using JavaScript
                JavascriptExecutor jse=(JavascriptExecutor)driver;
                jse.executeScript("window.open();");    
                

		        Object[] tabs = driver.getWindowHandles().toArray();

		         // switch to the new tab 
		        driver.switchTo().window(tabs[1].toString());

		          // Opening URL in the new tab
		        driver.get("https://www.github.com");

		          // to switch back to first tab
		        driver.switchTo().window(tabs[0].toString());

		        driver.quit();
		    }
				    
}
