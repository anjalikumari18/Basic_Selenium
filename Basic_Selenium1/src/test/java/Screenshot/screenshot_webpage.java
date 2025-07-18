package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_webpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.myntra.com/");
		
		//Typecasting
		TakesScreenshot tks=(TakesScreenshot)driver;
		
		//Take the ss in temp location using the ref variable
		
		File temp = tks.getScreenshotAs(OutputType.FILE);
		
		//Creating a permanent  location
		
		File perm=new File("./Errorshots/Screenshot1.png");
		
		//Moving from temporary to permanent location
		
		FileHandler.copy(temp, perm);
		
	}

}
