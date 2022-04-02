package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://training-support.net/selenium/dynamic-controls");
System.out.println(driver.getTitle());
		
		WebElement checkvox=driver.findElement(By.name("toggled"));
		System.out.println(checkvox.isSelected());
		driver.findElement(By.id("toggleCheckbox")).click();
		
		System.out.println(checkvox.isSelected());
		

	}

}
