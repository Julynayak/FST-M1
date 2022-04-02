package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");
		driver.getTitle();
		WebElement text1=driver.findElement(By.id("about-link"));
		System.out.println(text1.getText());
		
		WebElement text2=driver.findElement(By.className("green"));
		System.out.println(text2.getText());
		
		WebElement text3=driver.findElement(By.linkText("About Us"));
		System.out.println(text3.getText());
		
		
		WebElement text4=driver.findElement(By.cssSelector(".green"));
		System.out.println(text4.getText());
		
		
		
		driver.close();

	}

}
