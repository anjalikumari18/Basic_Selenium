package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookUsingLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Anjali");
	    driver.findElement(By.name("lastname")).sendKeys("Singh");
	    driver.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]")).sendKeys("123456789");
	    driver.findElement(By.id("password_step_input")).sendKeys("Password@!23");
	    driver.findElement(By.name("websubmit")).click();

	}

}
