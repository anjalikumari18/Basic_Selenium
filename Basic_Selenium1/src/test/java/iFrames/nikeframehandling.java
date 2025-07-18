package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nikeframehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.nike.com/in/");
		
		
		driver.findElement(By.id("gn-search-input")).sendKeys("women air jordan 1", Keys.ENTER);
		WebElement nike_shoes = driver.findElement(By.linkText("Air Jordan 1 Mid"));
		Actions act=new Actions(driver);
		act.moveToElement(nike_shoes).click().perform();
		driver.findElement(By.xpath("//label[text()='UK 6']")).click();
		driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();
		driver.findElement(By.linkText("View Bag")).click();
		

	}

}
