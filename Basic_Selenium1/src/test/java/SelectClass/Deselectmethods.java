package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselect1 = driver.findElement(By.id("multiselect1"));
		Select multi=new Select(multiselect1);
		multi.selectByIndex(0);
		multi.selectByValue("Hyundaix");
		Thread.sleep(2000);
		
		WebElement firstopt = multi.getFirstSelectedOption();
		System.out.println(firstopt.getText());
		
		List<WebElement> allOptions = multi.getOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
		
		List<WebElement> selectedoptions = multi.getAllSelectedOptions();
		for(WebElement selected:selectedoptions) {
			System.out.println(selected.getText());
		}
		
	
		//multi.deselectAll();
		//multi.deselectByIndex(2);
		//multi.deselectByValue("volvox");
		
		System.out.println(multi.isMultiple());
		
		
		
		

		
		
	}

}
