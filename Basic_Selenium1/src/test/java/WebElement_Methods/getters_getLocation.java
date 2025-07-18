package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getters_getLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(text(),'Log in')]"));
		Dimension size = LoginButton.getSize();

		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		Point location = LoginButton.getLocation();
		location.getY();
		
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		
		
	}

}
