package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By login = By.id("loginSubmit");
	
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement GetUsername() {
		
		return driver.findElement(username);
		  
	}
	public WebElement GetPassword() {
		
		return driver.findElement(password);
		  
	}
	
	public WebElement login() {
		
		return driver.findElement(login);
		  
	}
}
