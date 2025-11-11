package ActionsClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class KeyUp_Down {

	public static void main(String[] args) throws IOException {
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
		
		TakesScreenshot tks=(TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Errorshots/screenshot45.png");
		FileHandler.copy(temp, perm);

	}

}
