package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLChrome {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();
				handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				WebDriver driver = new ChromeDriver (handlSSLErr);
		driver.get("https://10.100.21.175:8081/external");
	}

}
