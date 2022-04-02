package IBMActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.training-support.net/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("about-link")).click();
		System.out.println(driver.getTitle());

	}

}
