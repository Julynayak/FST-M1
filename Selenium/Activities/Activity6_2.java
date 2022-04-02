package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Change Content']")).click();
		
		WebElement helloText=driver.findElement(By.xpath("//h1[text()='HELLO!']"));
		/*WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.textToBePresentInElementLocated(helloText));
*/
		
		System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText());
		driver.close();
	}

}
