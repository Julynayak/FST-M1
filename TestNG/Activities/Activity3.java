package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.get(" https://www.training-support.net/selenium/login-form");
	}
	
	
	@Test
	public void loginTest() {
		 driver.findElement(By.id("username")).sendKeys("admin");;
	         driver.findElement(By.id("password")).sendKeys("password");
	         driver.findElement(By.xpath("//button[text()='Log in']")).click();
	         String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	         Assert.assertEquals("Welcome Back, admin", loginMessage);
	}
	@AfterClass
	public void afterclass() {
		driver.close();

}}
