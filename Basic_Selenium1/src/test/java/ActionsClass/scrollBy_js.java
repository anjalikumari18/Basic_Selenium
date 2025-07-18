package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBy_js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://doodles.google/search/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		//js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);

		//js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);

		//js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);

		//js.executeScript("window.scrollBy(0,-1000)");
		
		js.executeScript("window.scrollTo(0,100)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,900)");
		
		//extreme bottom
		
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		Thread.sleep(4000);

		//scroll top
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		
		WebElement element=driver.findElement(By.xpath("(//a[@href=\"/creating-a-doodle/\"])[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);


		


		


	}

}
