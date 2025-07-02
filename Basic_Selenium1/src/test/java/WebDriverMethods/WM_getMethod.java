package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WM_getMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		
		            //or
		
		String url = "https://www.facebook.com/";
		
		driver.get(url);

	}

}
