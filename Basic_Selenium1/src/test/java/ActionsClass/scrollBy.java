package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://doodles.google/search/");
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 400).perform();
		action.scrollByAmount(0, 100).perform();
		action.scrollByAmount(0, 700).perform();
		
		//Scrolling back using -ve value
		action.scrollByAmount(0, -1000).perform();


	

	}

}
