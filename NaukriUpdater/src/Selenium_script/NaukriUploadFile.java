package Selenium_script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaukriUploadFile {
 
 public static String naukari = "https://login.naukri.com/nLogin/Login.php";
 public static String nauk = "http://www.naukri.com/";
 public static String upload = ".//*[@id='colL']/div[2]/div[1]/a[2]";
 public static String view = ".//*[@id='colL']/div[2]/div[1]/span";
 public static String view1 = ".//*[@id='colL']/div[2]/div[1]/a[1]";
 public static String up_prof = ".//*[@id='uploadLink']";
 public static String save = ".//*[@id='editForm']/div[8]/button";
 public static String mynauk = ".//*[@id='mainHeader']/div/div/ul[2]/li[2]/a/div[2]";
 
 public static void setClipboardData(String st) {
  
     StringSelection stringSelection = new StringSelection(st);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
  }

 public static void main(String[] args) throws AWTException {
  
  
  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver dri = new ChromeDriver();
  dri.get(nauk);
  
    
  dri.findElement(By.xpath(".//*[@id='login_Layer']/div")).click();
  WebElement fra = dri.findElement(By.xpath(".//*[@id='loginLB']/div[2]"));
  
  fra.click();
  
  dri.findElement(By.id("eLogin")).sendKeys("pranjal619saxena@gmail.com"); //Enter your username
  dri.findElement(By.id("pLogin")).sendKeys("100100"); // Enter your password
  dri.findElement(By.xpath(".//*[@id='lgnFrm']/div[7]/button")).click();
  dri.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
  
  dri.manage().window().maximize();
  
  //Logged in
  //Clicking on view profile
  WebElement view_prof = dri.findElement(By.xpath(view1));
  Actions builder = new Actions(dri);
  builder.click(view_prof).build().perform();
  
  
  
  //Clicking on upload link
  WebElement prof_upload = dri.findElement(By.xpath(up_prof));
  prof_upload.click();
  
  WebElement attachcv = dri.findElement(By.xpath(".//*[@id='attachCV']"));
  Actions builder1 = new Actions(dri);
  builder1.click(attachcv).build().perform();
  
  
  
  //upload the file
  //The below method calls the setclipboard method and put the file path in clipboard
    
  setClipboardData("C:\\Users\\pranjal\\Downloads\\QA_Automation_Resume_Pranjal.docx");
  
  //The below lines of code will paste the clipboard content and click open button in the modal window
  
  Robot robot = new Robot();
  robot.delay(500);

  robot.keyPress(KeyEvent.VK_CONTROL); //Press control key
  robot.keyPress(KeyEvent.VK_V); //Press key v
  robot.keyRelease(KeyEvent.VK_V); // Release "v"
  robot.keyRelease(KeyEvent.VK_CONTROL); //Release ctrl key
  robot.keyPress(KeyEvent.VK_ENTER); //Press enter key that clicks the open button in the modal
  robot.keyRelease(KeyEvent.VK_ENTER); //Release the enter key
  robot.delay(1000); //Delay in milli seconds
  
  //Closing the modal window of upload file
  WebElement sav_btn = dri.findElement(By.xpath(save));
  sav_btn.click();
  
  //Log out button
  
  
  
  WebElement my_naukri = dri.findElement(By.xpath(mynauk));
  WebElement log_out = dri.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/div/ul/li[5]/a"));
  Actions builder3 = new Actions(dri);
  builder3.moveToElement(my_naukri).click(log_out).build().perform();
  
  
  
  
  

  
 } 

}
