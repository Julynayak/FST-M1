package IBMActivity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/selenium/tables ");
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		System.out.println(column.size());
	
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println(rows.size());
		
		WebElement secondRow=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println(secondRow.getText());
		
		 driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
		
		WebElement secondrow=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println(secondrow.getText());
		
		List<WebElement> footer=	driver.findElements(By.xpath("//tfoot/tr/th"));
		for(WebElement footerValue:footer) {
			System.out.println(footerValue.getText());
		}

		driver.close();
	}

}
