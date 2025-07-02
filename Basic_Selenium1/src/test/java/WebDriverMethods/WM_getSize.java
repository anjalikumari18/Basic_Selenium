package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WM_getSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension windowSize = driver.manage().window().getSize();
		System.out.println("The Dimensions are"+" "+windowSize);
		
		int height = windowSize.getHeight();
		int width = windowSize.getWidth();
		
		System.out.println("The height is"+" "+height);
		System.out.println("The width is"+" "+width);
		
		
	}

}
