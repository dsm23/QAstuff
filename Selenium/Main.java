import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	
	//	change PATH
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\dsm1g11\\workspace\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","PATH\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.co.uk/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testOption() throws Exception {
	driver.get("http://www.autotrader.co.uk/");
    assertTrue(isElementPresent(By.id("main-content")));
    try {
      assertTrue(isElementPresent(By.id("searchVehiclesMake")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("option[value=\"ASTON MARTIN\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("searchVehiclesMake")).clear();
    driver.findElement(By.id("searchVehiclesMake")).sendKeys("ASTON MARTIN");
    assertTrue(isElementPresent(By.id("searchVehiclesModel")));
    try {
      assertTrue(isElementPresent(By.id("searchVehiclesModel")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("searchVehiclesModel")).clear();
    driver.findElement(By.id("searchVehiclesModel")).sendKeys("ONE-77");
    driver.findElement(By.id("search")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
