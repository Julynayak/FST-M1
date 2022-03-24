package Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver; // scope is globaly defines and it will be accesible for all method
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.training-support.net");
	}
	
	@Test
	public void exampleTestCase() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Training Support", title);
		
		 driver.findElement(By.id("about-link")).click();
		 System.out.println( driver.getTitle());
		 
		 Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	
		@AfterMethod
		public void afterMethod() {
			driver.quit();
		
		
	}

}
