package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//https://html.com/tags/iframe/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://html.com/tags/iframe/");
		
		
		WebElement youtube = driver.findElement(By.xpath("//iframe[@src=\"https://www.youtube.com/embed/owsfdh4gxyc\"]"));
		youtube.click();

	}

}
