package seleniumDrag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	static WebDriver driver;	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\geckodriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		
		driver.get("file:///C:/Users/Administrator/Downloads/Re%253a_Selenium_Content_-_Practice_HTML_Pages/HTML/HTML/DragAndDrop.html");
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
		
		int diff = droppable.getLocation().getX() - draggable.getLocation().getX() +1;
		
		builder.dragAndDropBy(draggable, diff, 0).perform();
	}
}
