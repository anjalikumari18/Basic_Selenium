package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement Computers = driver.findElement(By.linkText("COMPUTERS"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Computers).perform();
		Thread.sleep(2000);
		
		WebElement accessories = driver.findElement(By.linkText("Accessories"));
		act.moveToElement(accessories).click().perform();
		
		
		

	}

}
