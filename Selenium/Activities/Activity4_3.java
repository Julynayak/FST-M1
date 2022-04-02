package IBMActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		System.out.println(driver.getTitle());
		
		WebElement thirdheader=driver.findElement(By.id("third-header"));
		System.out.println(thirdheader.getText());
		
		WebElement fifthHeader=driver.findElement(By.xpath("//h5[@class='ui green header']"));
		System.out.println(fifthHeader.getCssValue("color"));
		
		
		WebElement violet=driver.findElement(By.xpath("//button[@class='ui violet button']"));
		System.out.println(violet.getAttribute("class"));
		
		
		String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
 
        //Close the browser
        driver.close();
	}

}
