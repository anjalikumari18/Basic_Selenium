package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WM_manageMethods1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			//Second line of code
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);

			driver.manage().window().minimize();
			Thread.sleep(3000);

			driver.manage().window().fullscreen();


	}

}
