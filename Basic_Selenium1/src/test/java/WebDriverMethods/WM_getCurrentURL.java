package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WM_getCurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
