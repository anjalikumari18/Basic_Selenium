package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {

public static void main(String[] args) {

    //Create a Spark Reporter (HTML report)
    ExtentSparkReporter reporter = new ExtentSparkReporter("ExtentReport.html");

    //Create ExtentReports and attach reporter
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(reporter);

    //Create a test case entry in the report
    ExtentTest test = extent.createTest("Google Launch Test");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    test.log(Status.INFO, "Chrome Browser Launched");

    driver.get("https://www.google.com");
    test.pass("Navigated to Google");

    String title = driver.getTitle();
    if (title.contains("Google")) {
        test.pass("Title Verified Successfully");
    } else {
        test.fail("Title Verification Failed");
    }

    driver.quit();
    test.info("Browser Closed");

    extent.flush();

    System.out.println("✅ Test Execution Completed. Check 'ExtentReport.html' file.");
    
}
}