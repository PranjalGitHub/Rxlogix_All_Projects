package PVIntake.PV_Product;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.IntakeList;

@Listeners(Listener.TestNgListeners.class)
public class Dashboard extends Base{
	@BeforeTest
	public void initialize() throws IOException {
	driver = initializeDriver();
	}
	
	
	@Test
	
	
	public void Login() throws IOException, InterruptedException {
		
	driver.get("http://10.100.22.171:8081/external");
	LoginPage lp = new LoginPage(driver);
	lp.GetUsername().sendKeys("pranjal");
	lp.GetPassword().sendKeys("Welcome@1");
	lp.login().click();
}
	@Test
	public void IntakeList() {
		IntakeList Ic = new IntakeList(driver);
		Ic.NavigateIntake().click();
		
	}
	
	@Test
	
	public void PVAdmin() {
		pageObjects.PVAdmin Pa = new pageObjects.PVAdmin(driver);
		Pa.PVadminpage().click();
		
	}
	
	@Test
	public void Security() {
		pageObjects.PVAdmin Pa = new pageObjects.PVAdmin(driver);
		Actions a = new Actions(driver);
		
		a.moveToElement(Pa.SecurityLink()).build().perform();
		Pa.UserMgMt().click();
		
	}
	
}