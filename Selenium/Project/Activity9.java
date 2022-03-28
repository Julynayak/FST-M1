package CRM_Project_IBM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	
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
	public void Traversing_table() {
		driver.findElement(By.cssSelector("#user_name")).sendKeys("admin");
		driver.findElement(By.cssSelector("#username_password")).sendKeys("pa$$w0rd");
				driver.findElement(By.cssSelector("#bigbutton")).click();
				
				WebElement sales=driver.findElement(By.cssSelector("#grouptab_0"));
			    Actions a=new Actions(driver);
			    a.moveToElement(sales).build().perform();
			    driver.findElement(By.linkText("Leads")).click();
			    
			    
			  List<WebElement> allname=  driver.findElements(By.xpath("//tbody/tr/td[3]"));
			  for(int i=0;i<14;i++) {
				  System.out.println(allname.get(i).getText());
				  
			  }
			
			  List<WebElement> allUsers=driver.findElements(By.xpath("//tbody/tr/td[8]"));
			  for(int i=0;i<10;i++) {
				  System.out.println(allUsers.get(i).getText());
				  
				  
			  }
			  driver.close();

}}
