import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PVISort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://10.100.22.228:8081/external");
		driver.findElement(By.id("username")).sendKeys("pranjal");
		driver.findElement(By.id("password")).sendKeys("Welcome@1");
		driver.findElement(By.id("loginSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='waves-effect waves-primary side-icon '])[4]")).click();;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//th[contains(@class,'col-intake-case sorting')][1]")).click();
		driver.findElement(By.xpath("//th[contains(@class,'col-intake-case sorting')][1]")).click();
		List<WebElement> firstColList = driver.findElements(By.cssSelector("//td[@class=' col-intake-case']/a"));

		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstColList.size(); i++)

		{

			originalList.add(firstColList.get(i).getText());

		}

		ArrayList<String> copiedList = new ArrayList<String>();

		for (int i = 0; i < originalList.size(); i++)

		{

			copiedList.add(originalList.get(i));

		}

//string

		Collections.sort(copiedList);

// Collections.reverse(copiedList);

		for (String s1 : originalList)

		{

			System.out.println(s1);

		}

		System.out.println("*******************");

		for (String s2 : copiedList)

		{

			System.out.println(s2);

		}

		Assert.assertTrue(originalList.equals(copiedList));

	}


		

}
