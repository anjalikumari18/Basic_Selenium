package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(2000);

		WebElement checkbox = driver.findElement(By.xpath("//span[contains(text(),'Home')]/..//span[@class=\"rct-checkbox\"]"));
		checkbox.click();
		Thread.sleep(2000);
		System.out.println(checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000);
		System.out.println(checkbox.isSelected());
		
	}

}
