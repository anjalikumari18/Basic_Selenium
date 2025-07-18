package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions action=new Actions(driver);
		action.doubleClick(doubleClickButton).build().perform();
		
		action.contextClick(rightClickButton).perform();
		
		action.click(clickButton).perform();
		
		
	}

}
