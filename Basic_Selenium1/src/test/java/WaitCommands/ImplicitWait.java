package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[4]")).click();
		
		
	}

}
