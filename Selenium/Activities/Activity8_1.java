package IBMActivity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List<WebElement> Column=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		System.out.println(Column.size());
	
		List<WebElement> row= driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println(row.size());
		
		List<WebElement> thirdRow=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		for(WebElement cellvalue:thirdRow){
			System.out.println(cellvalue.getText());
		}

		List<WebElement> secondRow=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
		for(WebElement celldetails:secondRow) {
			System.out.println(celldetails.getText());
		}
		
		driver.close();
	}

}
