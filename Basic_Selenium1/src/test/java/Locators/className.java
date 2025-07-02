package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Register")).click();
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("Anjali");
	    driver.findElement(By.name("LastName")).sendKeys("Singh");
	    driver.findElement(By.id("Email")).sendKeys("anjali12345@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Pass@12345");
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("Pass@12345");
	    driver.findElement(By.id("register-button")).click();
		
		
	}

}
