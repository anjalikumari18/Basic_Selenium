package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		Thread.sleep(2000);
		WebElement selectbtn = driver.findElement(By.xpath("//option[@value=\"ms3\"]"));
		selectbtn.click();
		System.out.println(selectbtn.isSelected());
		
		

	}

}
