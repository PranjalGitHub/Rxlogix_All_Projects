package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/");
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='NO THANKS']")));
		Element.click();
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
	js.executeScript("alert('Dynamic pop up is handled')");
	Thread.sleep(3000);
		driver.quit();
		
		
	}

}
