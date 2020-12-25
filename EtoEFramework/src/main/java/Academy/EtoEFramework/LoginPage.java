package Academy.EtoEFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Submit = By.xpath("//input[@name='commit']");
	By username = By.id("user_email");
	By password = By.id("user_password");
	
public  LoginPage(WebDriver driver) {
	this.driver =driver;
}

public WebElement LoginButton() {
	return driver.findElement(Submit);
}
public WebElement getusername() {
	return driver.findElement(username);
}
public WebElement getpassword() {
	return driver.findElement(password);
}
}