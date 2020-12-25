package PVIntake.PV_Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	
public WebDriver initializeDriver() throws IOException {

	Properties prop = new Properties();
	
	FileInputStream fis = new FileInputStream("C:\\Users\\pranjal\\eclipse-workspace\\PV_Product\\Resources\\data.properties");
	
	prop.load(fis);
	
	String browsername = prop.getProperty("browser");
	
	if(browsername.equals("chrome"))
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		
			/*
			 * if(browsername.equals("firefox"))
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 * driver = new FirefoxDriver();
			 */
		
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 return driver;
		 
}
}
