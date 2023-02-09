package Demo_Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkin_Icliniq_Login {
	
	
	@Test
	void login() throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://icliniq.com/");

	
		System.out.println("Title Of the Page : " + driver.getTitle());
		
		driver.close();

	}
		
		
	}


