package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\ClassDocs\\commondatafacebook.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		System.out.println(URL);
	   String USER = prop.getProperty("username");
	   System.out.println(USER);
	   String PASSWORD = prop.getProperty("password");
		System.out.println(PASSWORD);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		
		driver.findElement(By.id("email")).sendKeys(USER);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		
	}

}
