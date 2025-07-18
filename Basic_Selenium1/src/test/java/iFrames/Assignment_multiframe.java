package iFrames;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_multiframe {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Frames.html");

		// Passing control to single iframe using switch.to() and enter name
		driver.switchTo().frame("singleframe");
		WebElement singleInput = driver.findElement(By.xpath("//input[@type='text']"));
		singleInput.sendKeys("Anjali");

		// Taking screenshot of iframe only
		File iframeScreenshot_temp = singleInput.getScreenshotAs(OutputType.FILE);
		 File iframeScreenshot_perm=new File("./Errorshots/iframe_webelement.png");
		 FileHandler.copy(iframeScreenshot_temp, iframeScreenshot_perm);
		 
		// Switch back to main page
		driver.switchTo().defaultContent();

	
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

		//Switch to outer iframe
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);

		//Switch to inner iframe
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);

		//Enter name in inner iframe
		WebElement nestedInput = driver.findElement(By.xpath("//input[@type='text']"));
		nestedInput.sendKeys("Kumari");

		// Switching back to main content to take full page screenshot
		
		driver.switchTo().defaultContent();
		 TakesScreenshot tks=(TakesScreenshot) driver;
		 File fullPageScreenshot_temp =	tks.getScreenshotAs(OutputType.FILE);
		 File fullPageScreenshot_perm=new File("./Errorshots/iframe_webpage.png");
		 FileHandler.copy(fullPageScreenshot_temp, fullPageScreenshot_perm);
		 
		driver.findElement(By.xpath("//span[text()=\"Software testing tools\"]")).click();
		driver.quit();
	}
}
