package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WM_getPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.manage().window().getPosition());
		Point coordinates = driver.manage().window().getPosition();
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());
		
		driver.manage().window().setPosition(new Point(57, 98));
		
	
		
		

	}

}
