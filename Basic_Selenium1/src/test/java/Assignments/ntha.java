package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ntha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.xpath("//a[text()='Fiction']")).click();
        driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-45\"]")).click();
        Thread.sleep(8000);
        WebElement error_msg = driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your')]"));
        System.out.println(error_msg.getText());
        Thread.sleep(5000);
        WebElement Text = driver.findElement(By.xpath("//div[@id=\"bar-notification\"]"));
        System.out.println("The background color of the text is"+Text.getCssValue("color"));

	}

}
