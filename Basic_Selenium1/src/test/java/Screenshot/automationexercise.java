package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class automationexercise {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		/*website: https://automationexercise.com/

Choose category> Men/Women > Choose-sub-category

Choose any product >>Click on view product>>

Write the review>>Enter text in the three textfields>>Submit

Then click on Add to cart

Capture the screenshot of the entire confirmation pop-up>>Your product has been added to the cart
*/
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
		
		WebElement Women = driver.findElement(By.xpath("//a[@href=\"#Women\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(Women).click().perform();
		WebElement Top = driver.findElement(By.xpath("//a[@href=\"/category_products/2\"]"));
		act.moveToElement(Top).click().perform();
		act.scrollByAmount(0, 150).perform();
		WebElement top_3 = driver.findElement(By.xpath("//a[@href=\"/product_details/6\"]"));
		top_3.click();
		act.scrollByAmount(0, 350).perform();
		driver.findElement(By.id("name")).sendKeys("Anjali");
		driver.findElement(By.id("email")).sendKeys("anjali@gmail.com");
		driver.findElement(By.name("review")).sendKeys("Good product");
		driver.findElement(By.id("button-review")).click();
		act.scrollByAmount(0, -350).perform();
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(3000);
		WebElement confirmation_popup = driver.findElement(By.xpath("//div[@class=\"modal-content\"]"));
		File temp = confirmation_popup.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Errorshots/confirmpopup.png");
		FileHandler.copy(temp, perm);
		driver.quit();
		

		
		
		
		
		
		
		

	}

}
