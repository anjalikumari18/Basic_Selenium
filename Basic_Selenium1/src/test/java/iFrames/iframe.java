package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qa-automation-practice.netlify.app/iframe\r\n");
		//Switching control to frame
		driver.switchTo().frame(0);
		
		WebElement heading1 = driver.findElement(By.xpath("//h1[text()='Hello, this is an Iframe!']"));
		System.out.println(heading1.getText());
		//Switching control back to parent frame
		driver.switchTo().parentFrame();
		
		WebElement main_head = driver.findElement(By.xpath("//h2[text()=\"Iframe Example\"]"));
		System.out.println(main_head.getText());
		
	
	}

}
