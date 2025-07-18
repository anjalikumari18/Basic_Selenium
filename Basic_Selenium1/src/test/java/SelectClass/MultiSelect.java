package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://omayo.blogspot.com/");

		WebElement Multiselect_Listbox = driver.findElement(By.id("multiselect1"));

		Select ListBox = new Select(Multiselect_Listbox);
		// Select methods
		ListBox.selectByIndex(0);
		ListBox.selectByValue("swiftx");
		ListBox.selectByVisibleText("Hyundai");

		// isMultiple
		System.out.println("The list box is multiselect?" +ListBox.isMultiple());

		// getFirstSelectOption

		System.out.println("The first selected option is:"+ListBox.getFirstSelectedOption().getText());
		
		//getAllSelectedOption
		List<WebElement> allSelectedOptions = ListBox.getAllSelectedOptions();
		for(WebElement selectedOptions:allSelectedOptions) {
			System.out.println("The only selected options are:"+selectedOptions.getText());
		}

		// getOptions
		List<WebElement> allOptions = ListBox.getOptions();
		for (WebElement option : allOptions) {
			System.out.println("All the options present in the list box are: "+option.getText());
		}

		// ListBox.deselectAll();

		// Deselect methods

		ListBox.deselectByValue("swiftx");
		ListBox.deselectByIndex(0);
		ListBox.deselectByVisibleText("Hyundai");

	}

}
