package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntakeList {

	
	public WebDriver driver;
	
	By intakeMenu = By.xpath("//a[@class='waves-effect waves-primary side-icon ' and @href='/intake/queue']");

	public IntakeList(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement NavigateIntake() {
		
		return driver.findElement(intakeMenu);
		  
	}

}
