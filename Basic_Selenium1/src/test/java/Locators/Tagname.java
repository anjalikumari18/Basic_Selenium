package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.amazon.in/");
		    Thread.sleep(2000);
		   List<WebElement> links = driver.findElements(By.tagName("a"));
		   System.out.println(links.size());
		
		
		
	}

}
