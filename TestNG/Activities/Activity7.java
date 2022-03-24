package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	@DataProvider(name="Authentication")
	public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
		
	}
@Test(dataProvider = "Authentication")
public void loginTestCase(String username, String password) {
	driver.findElement(By.id("username")).sendKeys("username");
	driver.findElement(By.id("password")).sendKeys("password");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();

String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
Assert.assertEquals(loginMessage, "Welcome Back, admin");

}
@AfterClass
public void aftermethod() {
	driver.close();
}
}