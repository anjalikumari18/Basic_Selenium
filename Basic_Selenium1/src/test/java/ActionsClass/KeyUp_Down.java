package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement fn = driver.findElement(By.id("FirstName"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(fn, "anjali").keyUp(Keys.SHIFT).perform();
		WebElement ln = driver.findElement(By.id("LastName"));

		action.click(ln).keyDown(ln, Keys.SHIFT).sendKeys("singh").keyUp(Keys.SHIFT).perform();

	}

}
