package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDemoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/telecom/index.html\r\n");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Add Customer")).click();
	    driver.findElement(By.xpath("//label[@for=\"done\"]")).click();
	    driver.findElement(By.id("fname")).sendKeys("Anjali");
	    driver.findElement(By.id("lname")).sendKeys("Singh");
	    driver.findElement(By.id("email")).sendKeys("anjali@gmail.com");
	    driver.findElement(By.xpath("//textarea[@placeholder=\"Enter your address\"]")).sendKeys("XYZ");
	    driver.findElement(By.id("telephoneno")).sendKeys("87967554897");
	    driver.findElement(By.name("submit")).click();

	}

}
