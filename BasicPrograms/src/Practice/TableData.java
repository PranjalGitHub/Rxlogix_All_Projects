package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> rowcount= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		
		System.out.println(rowcount.size());;
		
		
		for (int i =2;i<=rowcount.size();i++) {
			WebElement column = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td[1]"));
			System.out.println(column.getText());
		}
	}

}
