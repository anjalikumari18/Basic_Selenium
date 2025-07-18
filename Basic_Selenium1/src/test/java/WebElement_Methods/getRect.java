package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(text(),'Log in')]"));
		Rectangle rect = LoginButton.getRect();
		System.out.println("The x coordinate is "+rect.getX());
		System.out.println("The y coordinate is "+rect.getY());
		System.out.println("The height is "+rect.getHeight());
		System.out.println("The width is "+rect.getWidth());
		System.out.println("The Dimensions are"+rect.getDimension());
		System.out.println("The coordinates are"+rect.getPoint());
	}

}
