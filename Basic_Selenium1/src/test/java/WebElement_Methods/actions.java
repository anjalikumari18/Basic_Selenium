package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.xpath("//label[text()='Female']/..//input[@value=\"F\"]")).click();

		WebElement firstName = driver.findElement(By.id("FirstName"));

		firstName.sendKeys("Anjali");

		Thread.sleep(2000);
		
		firstName.clear();
		
		driver.findElement(By.id("register-button")).submit();
		
		WebElement errorMsg1 = driver.findElement(By.xpath("//span[contains(text(),'First name is required.')]"));
		
		System.out.println(errorMsg1.getText());
		
		System.out.println(errorMsg1.getAttribute("for"));
		
		WebElement Books = driver.findElement(By.linkText("Books"));
		
		System.out.println("The color is "+" "+Books.getCssValue("color"));
		System.out.println("The font size is"+" "+Books.getCssValue("font-size"));
		System.out.println("The text decor is"+" "+Books.getCssValue("text-decoration"));

		
		
		
		

	}

}
