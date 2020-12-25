package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvenDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
			List<WebElement> list= dropdown.getOptions();
			
			for (int i =0;i<list.size();i++) {
				if(i%2==0) {
					System.out.println(list.get(i).getText());
			
				}
			}
				
	}

}
