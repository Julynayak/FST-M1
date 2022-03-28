package CRM_Project_IBM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://alchemy.hguy.co/crm/");
	}
	@Test
	public void Logging_Into_Site() {
		driver.findElement(By.cssSelector("#user_name")).sendKeys("admin");
		driver.findElement(By.cssSelector("#username_password")).sendKeys("pa$$w0rd");
				driver.findElement(By.cssSelector("#bigbutton")).click();
				
				
		WebElement act=	driver.findElement(By.cssSelector("#grouptab_3"));
			String text=act.getText();
			
			Assert.assertEquals(text, "ACTIVITIES");
			
			driver.close();
}}