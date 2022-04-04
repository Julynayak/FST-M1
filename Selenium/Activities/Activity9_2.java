package IBMActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		
		WebElement multivalue=driver.findElement(By.id("multi-value"));
	
		
		WebElement multiList=driver.findElement(By.id("multi-select"));
		Select s=new Select(multiList);
		s.selectByVisibleText("Javascript");
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.selectByValue("node");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByIndex(4);
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.selectByIndex(5);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByIndex(6);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("node");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByIndex(6);
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		
		
		

	}

}
