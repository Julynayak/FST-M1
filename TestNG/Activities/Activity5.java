package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {

	WebDriver driver;
	
	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}
	@Test
	public void testCases() {
		System.out.println(driver.getTitle());
		Assert.assertEquals("Target Practice", driver.getTitle());
		
	}
	
	@Test
	public void headerTest1() {
	WebElement header3=driver.findElement(By.cssSelector("#third-header"));
	Assert.assertEquals(header3.getText(), "Third header");
	
	}
	@Test
	public void HeaderTest2() {
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getText(), "rgb(251, 189, 8)");
    }
	
	@Test
	public void buttonTest() {
		WebElement buttonTest=driver.findElement(By.cssSelector(".ui.olive.button"));
		Assert.assertEquals(buttonTest.getText(), "Olive");
	}
	
	@AfterTest
	public void afterMethod() {
		driver.close();
	}
}
