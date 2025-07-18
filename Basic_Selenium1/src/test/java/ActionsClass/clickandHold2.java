package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandHold2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://yonobusiness.sbi/yonobusinesslogin");
		
		driver.findElement(By.id("userName")).sendKeys("Anjali");
		 WebElement Password_tf = driver.findElement(By.id("password"));
		 Password_tf.sendKeys("Password@123798");
		 
		 WebElement eye_button = driver.findElement(By.xpath("(//img[@class=\"ng-star-inserted\"])[1]"));
		 //eye_button.click();
		 
		 Actions action=new Actions(driver);
		 action.clickAndHold(eye_button).perform();
		 
		 Thread.sleep(5000);
		 
		 action.release(eye_button).perform();
		 System.out.println("Password was visible");
		

	}

}
