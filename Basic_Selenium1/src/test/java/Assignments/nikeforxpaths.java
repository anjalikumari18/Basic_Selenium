package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nikeforxpaths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//has too many iframes, will teach later
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.nike.com/in/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("gn-search-input")).sendKeys("Sports Shoes",Keys.ENTER);
	  //  driver.findElement(By.id("nav-search-icon")).click();
	
	    driver.findElement(By.linkText("Nike Downshifter 13")).click();
	    

	}

}
