package Academy.EtoEFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;

public class ValidateTitle extends base{
	private static Logger Log = LogManager.getLogger(ValidateTitle.class.getName());

	
	@BeforeTest
	public void initialize() throws IOException {
	driver = initializeDriver();
	Log.info("Driver is initialized");
	driver.get(prop.getProperty("url"));
	Log.info("URL is entered");
	}
	@Test
	public void basePageNavigation() {
		// TODO Auto-generated method stub


		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.Linktext().getText(),"FEATURED COURSES");
		Log.info("Text is verified");
				
		}
		
	@AfterTest
	public void teardown() {
		driver.close();
	}
		
	

}
