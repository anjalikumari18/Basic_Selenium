package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		Thread.sleep(2000);
		
		WebElement camera_accessories = driver.findElement(By.linkText("Cameras & Accessories"));
		act.moveToElement(camera_accessories).perform();
		Thread.sleep(2000);

		WebElement instant_camera = driver.findElement(By.linkText("Instant Cameras"));
		act.moveToElement(instant_camera).click().perform();
		
		
		

	}

}
