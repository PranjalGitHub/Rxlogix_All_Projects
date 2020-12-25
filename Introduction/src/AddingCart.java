import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
	String[] itemsneeded = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List itemsneededList = Arrays.asList(itemsneeded);
		for (int i=0;i< products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
					String formttedname = name[0].trim();
			
			if (itemsneededList.contains(formttedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==3) {
					break;
				}
				
				
			}
			
			
	}

}
}