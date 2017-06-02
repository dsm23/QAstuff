package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 
        driver.get("https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fcss%2Fhomepage.html%3Fie%3DUTF8%26%252AVersion%252A%3D1%26%252Aentries%252A%3D0");
        driver.findElement(By.id("ap_email")).sendKeys("QACTest@outlook.com");
        //driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.id("ap_password")).sendKeys("QACPa$$w0rd");
        driver.findElement(By.id("signInSubmit")).click();
        System.out.println("Log In Successful");
        driver.quit();
 
	

		
	}

}
