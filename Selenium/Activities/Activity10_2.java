package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		
		System.out.println(driver.getTitle());
		WebElement enterName=driver.findElement(By.cssSelector("#keyPressed"));
		Actions a=new Actions(driver);
		a.sendKeys("J").build().perform();
		
		a.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		System.out.println(enterName.getText());
		driver.close();
		
	        
	       

	}

}
