package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitCommands2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoqa.com/dynamic-properties");

		WebElement Button1 = driver.findElement(By.id("enableAfter"));

		WebElement Button2 = driver.findElement(By.id("colorChange"));

		WebElement Button3 = driver.findElement(By.id("visibleAfter"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(Button1));
		System.out.println("Clicked on 'Enable After 5 Seconds' button.");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("colorChange")));
		String color = Button2.getCssValue("color");
		System.out.println("Color of 'Color Change' button: " + color);

		wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
		Button3.click();
		System.out.println("Clicked on 'Enable After 5 Seconds' button.");

		// Close browser
		driver.quit();

	}

}
