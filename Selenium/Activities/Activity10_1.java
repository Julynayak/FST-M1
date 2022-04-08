package IBMActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity10_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.training-support.net/selenium/input-events");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#wrapD3Cube")).click();
		System.out.println(driver.findElement(By.cssSelector("#wrapD3Cube")).getText());
		driver.close();
		
	}

}
