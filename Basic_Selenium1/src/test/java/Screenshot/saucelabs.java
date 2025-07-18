package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class saucelabs {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement filter_dropdown = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select select=new Select(filter_dropdown);
		select.selectByValue("hilo");
		
		WebElement Product_details = driver.findElement(By.xpath("(//div[@class=\"inventory_item\"])[1]"));
		File temp = Product_details.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Errorshots/Product_SL.png");
		FileHandler.copy(temp, perm);
		System.out.println("Product details screenshot captured>> Refresh");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[1]")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		
		TakesScreenshot tks=(TakesScreenshot)driver;
		File temploc2=tks.getScreenshotAs(OutputType.FILE);
		File permloc2=new File("./Errorshots/cart_page.png");
		FileHandler.copy(temploc2, permloc2);
		System.out.println("The cart screenshot has been captured>>Refresh");
		
		
		
		
		
		
		
	}

}
