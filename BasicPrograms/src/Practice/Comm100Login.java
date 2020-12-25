package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comm100Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.comm100.com/login.aspx");
		driver.findElement(By.id("txtEmail")).sendKeys("username");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("lblLogin")).click();
		
}
}
