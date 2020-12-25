package Academy.EtoEFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Resources.base;

public class AcademyHomePage extends base{
	private static Logger Log = LogManager.getLogger(AcademyHomePage.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
	driver = initializeDriver();
	Log.info("Driver is initialized");
	}
	@Test(dataProvider="getdata")
	public void basePageNavigation(String username, String password, String text)  {
		// TODO Auto-generated method stub
		driver.get(prop.getProperty("url"));
		Log.info("URL is entered");
		LandingPage l = new LandingPage(driver);
		l.LoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(username);
		lp.LoginButton().sendKeys(password);
		System.out.println(text);
		lp.LoginButton().click();
		
	}
		
@DataProvider
public Object[][] getdata(){
	//rows stands for how many different data types test should run
	//column stands for how many values per each test
	
	Object[][] data = new Object[2][3];
	data[0][0] = "test1";
	data[0][1] = "password";
    data[0][2] = "restricted users";
	data[1][0] = "test2";
	data[1][1] = "password";
	data[1][2] = "restricted users";
	return data;
					
	
}

@AfterTest
public void teardown() {
	Log.info("Closing browser");
	driver.close();
}

}
