package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class isEnabledDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentSparkReporter reporter=new ExtentSparkReporter("Report.html");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest test=extent.createTest("Testing WWebelement verification");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		test.log(Status.INFO, "browser launched");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		Thread.sleep(4000);
		
		try {
			System.out.println("Is checkbox displayed: " + checkbox.isDisplayed());
		} catch (StaleElementReferenceException e) {
			System.out.println("Checkbox is removed from the page (stale element).");
		}
		
		test.log(Status.PASS, "test executed success");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		System.out.println(textbox.isDisplayed());
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		Thread.sleep(7000);
		System.out.println(textbox.isDisplayed());


		driver.close();
		
		test.log(Status.INFO, "driver closed");
		
		extent.flush();
		
		System.out.println("check Report.html");
		
		
		

		
	}

}
