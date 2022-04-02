package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://training-support.net/selenium/dynamic-controls");
		driver.findElement(By.id("toggleCheckbox")).click();
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.invisibilityOf(checkbox));
		
		
		driver.findElement(By.id("toggleCheckbox")).click();
		w.until(ExpectedConditions.visibilityOf(checkbox));
		
		checkbox.click();
		driver.close();
	
		
	}

}
