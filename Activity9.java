package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}
	
	@BeforeMethod
	public void runbeforeMthod() {
		driver.switchTo().defaultContent();
	}
	
		
	@Test(priority = 0)
	public void simpleAlertTestCase() {
		driver.findElement(By.cssSelector("#simple")).click();;
		System.out.println(driver.findElement(By.cssSelector("#simple")).getText());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@Test(priority = 1)
	public void confirmAlertTestCase() {
		driver.findElement(By.cssSelector("#confirm")).click();;
		System.out.println(driver.findElement(By.cssSelector("#confirm")).getText());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@Test(priority = 2)
	public void promptAlertTestCase() {
		driver.findElement(By.cssSelector("#prompt")).click();;
		System.out.println(driver.findElement(By.cssSelector("#prompt")).getText());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	
	
	
	@AfterClass
	public void aftermethod() {
		driver.close();
	}

}
