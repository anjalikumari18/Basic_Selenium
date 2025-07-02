package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartUsingLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	   // driver.findElement(By.cssSelector("span[role=\"button\"]")).click();
	    
	    Thread.sleep(2000);

	    driver.findElement(By.cssSelector("input[title=\"Search for Products, Brands and More\"]")).sendKeys("Laptop");

	    driver.findElement(By.cssSelector("button[aria-label=\"Search for Products, Brands and More\"]")).click();

	    driver.findElement(By.cssSelector("img[src=\"https://rukminim2.flixcart.com/image/312/312/xif0q/computer/q/f/w/-original-imahcd9zayg6hgxp.jpeg?q=70\"]")).click();
	}

}
