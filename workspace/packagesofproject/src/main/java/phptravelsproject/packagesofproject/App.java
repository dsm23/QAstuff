package phptravelsproject.packagesofproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\geckodriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);

		Home H = new Home(driver);
		//Solutions S = new Solutions(driver);
		
		driver.get("http://www.phptravels.net");
		
		System.out.println(H.getTitle());
		
		H.clickSolutionsLink();
		
		WebElement loginnav = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a"));
		loginnav.click();
		WebElement loginclick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]"));
		loginclick.click();
		
		WebElement loginuser = driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/div/div[1]/input"));
		loginuser.sendKeys("user@phptravels.com");
		WebElement loginpass = driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/div/div[2]/input"));
		loginpass.sendKeys("demouser");
		loginclick = driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/button"));
		loginclick.click();
		
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div[2]/div[3]/h5/strong")));
		
		WebElement selectlogout = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a"));
		selectlogout.click();
		WebElement clicklogout = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a"));
		clicklogout.click();
		
		driver.close();
	}
}