package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver = null;

		@Given("^the user is at the login screen$")
		public void the_user_is_at_the_login_screen() throws Throwable {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fcss%2Fhomepage.html%3Fie%3DUTF8%26%252AVersion%252A%3D1%26%252Aentries%252A%3D0");
	        
		}

		@When("^the user enters a valid username and password$")
		public void the_user_enters_a_valid_username_and_password() throws Throwable {
			driver.findElement(By.id("ap_email")).sendKeys("QACTest@outlook.com");
	        //driver.findElement(By.id("idSIButton9")).click();
	        driver.findElement(By.id("ap_password")).sendKeys("QACPa$$w0rd");
	        
		}

		@When("^the user clicks on the sign in button$")
		public void the_user_clicks_on_the_sign_in_button() throws Throwable {
			driver.findElement(By.id("signInSubmit")).click();
	        
		}

		@Then("^the user will successfully log in$")
		public void the_user_will_successfully_log_in() throws Throwable {
			System.out.println("Log In Successful");
	        //driver.quit();
		    //throw new PendingException();
		}
}
