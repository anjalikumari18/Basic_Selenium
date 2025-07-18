package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		Thread.sleep(4000);
		
		try {
			System.out.println("Is checkbox displayed: " + checkbox.isDisplayed());
		} catch (StaleElementReferenceException e) {
			System.out.println("Checkbox is removed from the page (stale element).");
		}
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		System.out.println(textbox.isDisplayed());
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		Thread.sleep(7000);
		System.out.println(textbox.isDisplayed());


		

		
	}

}
