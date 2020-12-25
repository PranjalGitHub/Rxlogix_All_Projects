import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment1Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String OptionLabel = driver.findElement(By.name("checkBoxOption2")).getAttribute("value");
		driver.findElement(By.name("checkBoxOption2")).click();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(OptionLabel);
		driver.findElement(By.id("name")).sendKeys(OptionLabel);
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		String AlertText = driver.switchTo().alert().getText();
				Thread.sleep(3000);
		if (AlertText.contains(OptionLabel)){
			System.out.println("Text present in Alert");
		}
		else {System.out.println("Text not present in alert");}
		driver.switchTo().alert().accept();	
	}

}
