package seleniumTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loggingtest {

	static WebDriver driver;

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://owa.qa.com/");

		boolean result = true;

		WebElement userinput = driver.findElement(By.id("username"));
		WebElement passinput = driver.findElement(By.id("password"));
		WebElement btninput = driver.findElement(By.className("signinbutton"));

		userinput.sendKeys("corp\\DMurdock");
		passinput.sendKeys("Password123");
		btninput.submit();

		WebDriverWait wait = new WebDriverWait(driver, 5);

		try {

			System.out.println("Searching...");
			result = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("image-owa_brand-png"),"Success"));
		} catch (NoSuchElementException e) {
			result = false;
			System.out.println(e);
		} finally {
			// driver.close();
		}
		if (result) {
			System.out.println("---Passed---");
		} else {
			System.out.println("---Failed---");
		}
	}
}