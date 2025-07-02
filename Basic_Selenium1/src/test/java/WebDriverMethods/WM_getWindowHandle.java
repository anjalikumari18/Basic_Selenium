package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WM_getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shoppersstack.com/products_page/3864");
		//capturing the parent window
		String parentID=driver.getWindowHandle();
		System.out.println(parentID);
		Thread.sleep(15000);
		
		driver.findElement(By.id("compare")).click();
		//Capturing both parent and child windows
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		allIds.remove(parentID); //removing parent window
		//Passing the driver control to child windows
		for(String id: allIds ) {
			driver.switchTo().window(id);
			driver.close();
			Thread.sleep(2000);
		}
		//Switching control back to parent
		driver.switchTo().window(parentID);
	}

}
