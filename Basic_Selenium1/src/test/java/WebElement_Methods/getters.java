package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement searchBtn = driver.findElement(By.cssSelector("input[value=\"Search\"]"));
		Dimension dimension = searchBtn.getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("The dimensions are: "+dimension);
		System.out.println("Height of a webelement:"+height);
		System.out.println("Width of a webelement:"+width);
		

		

	}

}
