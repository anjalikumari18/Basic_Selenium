package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonusingxpaths {

	public static void main(String[] args) throws InterruptedException {


	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    Thread.sleep(2000);
    
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
    driver.findElement(By.id("nav-search-submit-button")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']/../../../..//li[@id=\"p_90/6741118031\"]")).click();
    Thread.sleep(5000);

   // driver.findElement(By.xpath("//span[text()='Sony']/../../../..//li[@id=\"p_123/237204\"]")).click();
    driver.findElement(By.xpath("//span[text()='Sony']/../../../..//i[@class=\"a-icon a-icon-checkbox\"]")).click();


    
	
}
}
