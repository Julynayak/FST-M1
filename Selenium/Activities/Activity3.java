package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("firstName")).sendKeys("Juli1");
		driver.findElement(By.id("lastName")).sendKeys("Kumari");
		
		driver.findElement(By.id("email")).sendKeys("juli@abc");
		driver.findElement(By.id("number")).sendKeys("8759632148");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		

	}

}
