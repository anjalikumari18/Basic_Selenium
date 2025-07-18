package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html\r\n");
		driver.findElement(By.id("button00")).click();
		WebElement Button_1 = driver.findElement(By.id("button01"));
		WebElement Button_2 = driver.findElement(By.id("button02"));
		WebElement Button_3 = driver.findElement(By.id("button03"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Button_1));
		Button_1.click();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Button_2));
		Button_2.click();

		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Button_3));
		Button_3.click();

		
		
		
		
		
		

		

	}

}
