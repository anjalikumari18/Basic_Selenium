package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement Date = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		Select date_dropdown=new Select(Date);
		date_dropdown.selectByIndex(17);
		
		Select month_dropdown=new Select(Month);
		month_dropdown.selectByValue("3");
		
		Select year_dropdown=new Select(Year);
		year_dropdown.selectByVisibleText("2023");
		
		//year_dropdown.deselectByVisibleText("2023");
		
		
		

	}

}
