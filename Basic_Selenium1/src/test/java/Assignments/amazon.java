package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Hey making changes
		
		ExtentSparkReporter reporter=new ExtentSparkReporter("./EReports/AmazonReport.html");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest test=extent.createTest("Testing amazon web application");
				
		//I am also making changes in the code
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
		test.log(Status.INFO, "Launched amazon");

	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 16 Pro");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Pink')]")).click();

	    test.log(Status.PASS, "Product found");
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String title2 = driver.getTitle();
	    if (title2.contains("Amazon")) {
	        test.pass("Title Verified Successfully");
	    } else {
	        test.fail("Title Verification Failed");
	    }

	    
	    test.log(Status.WARNING, "Product may not match");
	    
	    extent.flush();
	    
	    System.out.println("Check folder EReports");
	    
	}

}
