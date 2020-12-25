package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.RediffHomePagePF;
import ObjectRepository.RediffLoginPage;

public class LoginApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.email().sendKeys("123");
		rd.pswd().sendKeys("321");
		rd.submit().click();
		RediffHomePagePF rh = new RediffHomePagePF(driver);
		rh.homelink().click();
		Thread.sleep(3000);
		rh.SearchBox().sendKeys("text");
	}

}
