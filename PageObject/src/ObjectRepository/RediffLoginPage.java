package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


		// TODO Auto-generated method stub

	
		By username = By.xpath("//input[@id='login1']");
		By password = By.id("password");
		By submit = By.name("proceed");
		
		
		public WebElement email() 
		{
			return driver.findElement(username);
		}
		public WebElement pswd() 
		{
			return driver.findElement(password);
		}
		public WebElement submit() 
		{
			return driver.findElement(submit);
		}
	}


