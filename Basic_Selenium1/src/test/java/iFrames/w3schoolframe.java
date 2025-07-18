package iFrames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schoolframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/html/html_youtube.asp");
		
		driver.findElement(By.linkText("Try it Yourself »")).click();
		
		Thread.sleep(4000);
		
		String parentIds = driver.getWindowHandle();
		Set<String> AllIds = driver.getWindowHandles();
		for(String id:AllIds)
		{
			driver.switchTo().window(id);
		}

		//parent iframe
		driver.switchTo().frame("iframeResult");
		//child iframe
		driver.switchTo().frame(0);

		//
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		Thread.sleep(10000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href=\"/html/default.asp\"]")).click();
		
		System.out.println("code run success");

	}

}
