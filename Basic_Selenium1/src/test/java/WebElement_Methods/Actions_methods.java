package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		/*
		//location
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Point loc = day.getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		//rect
		
		Rectangle rect = day.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getDimension());
		System.out.println(rect.getPoint());
		
		*/
		
		//cssvalue
				
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.linkText("Create new account"));
		System.out.println(button.getCssValue("background-color"));
		System.out.println(button.getCssValue("color"));
		System.out.println(button.getCssValue("font-size"));
		
		
		

		
		
		
		
		
		
		
		


	}

}
