package IBMActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println(driver.getTitle());
		
		Actions a=new Actions(driver);
	//	WebElement ball=driver.findElement(By.id("draggable"));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dropZone1=driver.findElement(By.id("droppable"));
		WebElement dropzone2=driver.findElement(By.id("droppable"));
		
		
		a.dragAndDrop(source,dropZone1 ).build().perform();
		WebDriverWait w=new WebDriverWait(driver,20);
		/*w.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1, "background colour"));
		System.out.println("ball entered in dropZone 1");*/
		
		a.dragAndDrop(source,dropzone2 ).build().perform();
		//w.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2, "background colour"));
		System.out.println("ball entered in dropZone 2");
		driver.close();
		
		
		
		
		

	}

}
