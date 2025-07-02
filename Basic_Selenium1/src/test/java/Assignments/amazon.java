package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 16 Pro");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@alt=\"Sponsored Ad - iPhone 16 Pro 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Batte...\"]")).click();

	   String title = driver.getTitle();
	   System.out.println(title);
	    
	}

}
