package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal_addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.snapdeal.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("inputValEnter")).sendKeys("Blutooth speaker");
	    driver.findElement(By.xpath("//span[text()=\"Search\"]")).click();
	    driver.findElement(By.xpath("//p[text()='NICEBUDS Bluetooth Speaker 100 W Bluetooth Speaker"
	    		+ " Bluetooth V 5.1 with USB,TWS feature Playback Time 6 hrs Assorted']")).click();
	    
	    String parentId = driver.getWindowHandle();
	    Set<String> AllID = driver.getWindowHandles();
	    AllID.remove(parentId);
	    
	    for(String id: AllID) {
	    	driver.switchTo().window(id);
	    }
	      
	    driver.findElement(By.xpath("//span[contains(text(),'add to cart')]")).click();
	    
	    
	 
	    
		
		
		

	}

}
