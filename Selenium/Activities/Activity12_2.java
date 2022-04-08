package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
	}

}
