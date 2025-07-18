package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_webelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://qspiders.com/");
		
		//Storing the webelement in a local variable of type: WebElement
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"DevPlaced Logo\"]"));
		
		File temp = logo.getScreenshotAs(OutputType.FILE);
		
		File perm=new File("./Errorshots/webelement1.png");
		
		FileHandler.copy(temp, perm);

	}

}
