package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println(driver.getTitle());
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		driver.switchTo().frame(frame1);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")));
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("color"));
		driver.findElement(By.id("actionButton")).click();
		
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("color"));
		
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		driver.switchTo().frame(frame2);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")));
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("color"));
		for(int i=0;i<=5;i++) {
		driver.findElement(By.id("actionButton")).click();
		
		System.out.println(driver.findElement(By.id("actionButton")).getText());
		System.out.println(driver.findElement(By.id("actionButton")).getCssValue("color"));
		}
		
	}

}
