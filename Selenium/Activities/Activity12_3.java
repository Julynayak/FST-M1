package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println(driver.getTitle());
		
		Actions a=new Actions(driver);
		WebElement signButton=driver.findElement(By.xpath("//button[@onclick='openModal()']"));
		a.moveToElement(signButton).build().perform();
		System.out.println(signButton.getAttribute("data-tooltip"));
		
		driver.findElement(By.xpath("//button[@onclick='openModal()']")).click();
		
		driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
        
        //Close browser
        driver.close();

	}

}
