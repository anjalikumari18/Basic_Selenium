package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).click();
	    
	
		
	}

}
