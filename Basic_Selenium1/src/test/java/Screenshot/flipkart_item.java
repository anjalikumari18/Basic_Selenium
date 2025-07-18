package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class flipkart_item {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        // Test case: Flipkart>Electronics>Pendrives>Choose one>Take screenshot
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		Thread.sleep(2000);
		
		WebElement pendrives = driver.findElement(By.linkText("Pendrives"));
		act.moveToElement(pendrives).click().perform();
		
		driver.findElement(By.linkText("HP v220w 2IN OTG 128 GB Pen Drive Compatible with Lapto...")).click();
		
		WebElement pendrive_image = driver.findElement(By.xpath("(//img[@alt=\"HP v220w 2IN OTG 128 GB Pen Drive Compatible with Laptop USB 2.0 Metal Case\"])[1]"));
		
		File temp = pendrive_image.getScreenshotAs(OutputType.FILE);
		
		File permanent=new File("./Errorshots/pendrive.png");
		
		FileHandler.copy(temp, permanent);
		
		
		
		
		
		
		
	}

}
