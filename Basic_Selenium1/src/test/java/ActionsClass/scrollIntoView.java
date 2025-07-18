package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		WebElement India = driver.findElement(By.xpath("//img[@alt=\"India\"]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Webelement on top
		js.executeScript("arguments[0].scrollIntoView(true)",India);
		
		Thread.sleep(3000);
		
		//Webelement on bottom
		js.executeScript("arguments[0].scrollIntoView(false)",India);


	}

}
