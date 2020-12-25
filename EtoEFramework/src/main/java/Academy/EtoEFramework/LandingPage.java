package Academy.EtoEFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By login = By.xpath("//span[contains(text(),'Login')]");
	By heading = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By Nav = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	By PopUp = By.xpath("//button[text()='NO THANKS']");
	
public  LandingPage(WebDriver driver) {
	this.driver =driver;
}

public WebElement LoginLink() {
	return driver.findElement(login);
}

public WebElement Linktext() {
	return driver.findElement(heading);
}

public WebElement getNavBar() {
	return driver.findElement(Nav);
}
public  int GetPopUpSize() {
	return driver.findElements(PopUp).size();
}

public WebElement GetPopUp() {
	return driver.findElement(PopUp);
}

}