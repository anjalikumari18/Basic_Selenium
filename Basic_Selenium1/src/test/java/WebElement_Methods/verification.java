package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(text(),'Log in')]"));
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());

		
	}

}
