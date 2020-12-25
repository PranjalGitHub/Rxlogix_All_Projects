package Academy.EtoEFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;

public class ValidateNavBar extends base{
	private static Logger Log = LogManager.getLogger(ValidateNavBar.class.getName());

	
	@BeforeTest
	public void initialize() throws IOException {
	driver = initializeDriver();
	Log.info("driver is initialized");
	driver.get(prop.getProperty("url"));
	Log.info("URL is entered");
	}
	@Test
	public void basePageNavigation() {
		// TODO Auto-generated method stub


		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavBar().isDisplayed());
		Log.info("Navigation bar is displayed");
					
		}
		
	@AfterTest
	public void teardown() {
		driver.close();
	}
		
	

}
