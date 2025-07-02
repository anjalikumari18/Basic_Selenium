package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByStartsWith {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Log in")).click();
	    
	    driver.findElement(By.xpath("//input[starts-with(@value,\"Log\")]")).click();
	    
	    
	    WebElement errorMessage = driver.findElement(By.xpath("//span[starts-with(text(),'Login was ')]"));
	
	    System.out.println(errorMessage.getText());

	}

}
