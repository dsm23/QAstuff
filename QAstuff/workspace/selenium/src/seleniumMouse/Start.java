package seleniumMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.*;


public class Start {

	static WebDriver driver;	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\geckodriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Administrator/Downloads/Re%253a_Selenium_Content_-_Practice_HTML_Pages/HTML/HTML/Sortable.html");
		
		WebElement two = driver.findElement(By.name("two"));
		WebElement three = driver.findElement(By.name("three"));
		
		Actions builder = new Actions(driver);
		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
	    
		//builder.moveByOffset(three.getLocation().getX(), three.getLocation().getY()).clickAndHold().moveByOffset(125, 0).release() .perform();
		
		//builder.clickAndHold(three) .release(two) .perform();
		int diff = two.getLocation().getX() - three.getLocation().getX() +1;

		builder.dragAndDropBy(three, diff, 0).perform();
		System.out.println(driver.getTitle());
		driver.close();
	}
}