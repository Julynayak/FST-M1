package IBMActivity;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("launcher")).click();
		
	Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentpage=it.next();
		String childpage=it.next();

		driver.switchTo().window(childpage);
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.id("actionButton")).click();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String>it2=handle.iterator();
		String parentpage2=it2.next();
		String childpage2=it2.next();

		driver.switchTo().window(childpage2);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
