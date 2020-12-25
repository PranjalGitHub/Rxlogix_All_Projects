package Alpha;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	private static Logger Log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Log.debug("Click on the button");
//Log.info("Clicked on the button");
//Log.error("Button not clicked");
//Log.fatal("Button not found");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
Log.info("Website Opened");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
String OptionLabel = driver.findElement(By.name("checkBoxOption2")).getAttribute("value");
driver.findElement(By.name("checkBoxOption2")).click();
Log.debug("CheckBox checked");
Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
s.selectByValue(OptionLabel);
driver.findElement(By.id("name")).sendKeys(OptionLabel);
Thread.sleep(3000);
driver.findElement(By.id("alertbtn")).click();//
String AlertText = driver.switchTo().alert().getText();
		Thread.sleep(3000);
if (AlertText.contains("text")){//OptionLabel
	System.out.println("Text present in Alert");
}
else {System.out.println("Text not present in alert");
Log.error("Button not clicked");}
driver.switchTo().alert().accept();	
	}

}
