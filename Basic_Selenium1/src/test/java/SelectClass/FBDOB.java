package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBDOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select day_dropdown=new Select(day);
		day_dropdown.selectByIndex(17);
		
		WebElement month = driver.findElement(By.id("month"));
		Select month_dropdown=new Select(month);
		month_dropdown.selectByValue("7");
		
		WebElement year = driver.findElement(By.id("year"));
		Select year_dropdown=new Select(year);
		year_dropdown.selectByVisibleText("2023");
		year_dropdown.deselectByVisibleText("2023");
		
		
		
		
		
		
		
		
		

	}

}
