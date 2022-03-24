package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(" https://www.training-support.net/selenium/login-form");
		
	}
	@Test
	@Parameters({"username","password"})
	public void  testExample(String username,String password) {
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
	@AfterClass
	public void afterMethod() {
		driver.close();
	}

}
