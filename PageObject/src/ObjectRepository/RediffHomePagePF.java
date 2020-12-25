package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {

	WebDriver driver;
	public RediffHomePagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}


		// TODO Auto-generated method stub

	@FindBy(xpath="//a[@class='f12']")
	WebElement homelink;
	
	@FindBy(xpath="//input[@class='homesrchbox']")
	WebElement SearchBox;
	
		
		public WebElement homelink() 
		{
			return homelink;
		}
		public WebElement SearchBox() 
		{
			return SearchBox;
		}

	}


