import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetData {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://news.google.com/");
		
		driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']")).sendKeys("US Elections");
		driver.findElement(By.xpath("//button[@class='gb_zf']")).click();
		Thread.sleep(5000);
		String link1 = driver.findElement(By.xpath("(//a[@class='VDXfz'])[1]")).getTagName();
		String link2 = driver.findElement(By.xpath("(//a[@class='VDXfz'])[2]")).getText(); 
		
		System.out.println(link1);
		System.out.println(link2);
		
		
		
		
		
}
}
