package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("password");


driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();

System.out.println(driver.findElement(By.id("action-confirmation")).getText());

driver.close();
	}

}
