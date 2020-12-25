package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PVAdmin {

	public WebDriver driver;
	
	By admin = By.xpath("//a[contains(text(),'PVAdmin')]");
	
	By security = By.className("md md-security");

	By usermgmt = By.xpath("(//a[@class='waves-effect waves-primary side-icon'])[1]");
	
	public PVAdmin(WebDriver driver) {
	
		this.driver = driver;
	}
	
	public WebElement PVadminpage() {
		
		return driver.findElement(admin);
		  
	}
	
	public WebElement SecurityLink() {
		
		return driver.findElement(security);
		  
	}
	
	public WebElement UserMgMt() {
		
		return driver.findElement(usermgmt);
		  
	}
}
