package StepDefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import Academy.EtoEFramework.LandingPage;
import Academy.EtoEFramework.LoginPage;
import Resources.base;

@RunWith(Cucumber.class)
public class StepsDefinition extends base{

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver = initializeDriver();
        
    }
    
    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String strArg1) throws Throwable {
		driver.get(strArg1);
		

    }

    @And("^Click on login link to navigate to login page$")
    public void click_on_login_link_to_navigate_to_login_page() throws Throwable {
    	LandingPage l = new LandingPage(driver);
    	if (l.GetPopUpSize()>1)
    		l.GetPopUp().click();
    	else
		l.LoginLink().click();
    }

    
    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(username);
		lp.LoginButton().sendKeys(password);
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	LoginPage lp = new LoginPage(driver);
    	lp.LoginButton().click(); 
    }

    @And("^Close all the browsers$")
    public void close_all_the_browsers() throws Throwable {
    	driver.quit();
      
    }
 

}