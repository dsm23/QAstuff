package cookieSel;

import java.io.*;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class attempt {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\geckodriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);

		driver.get("https://www.reddit.com//");

		WebElement userinput = driver.findElement(By.name("user"));
		WebElement passinput = driver.findElement(By.name("passwd"));

		userinput.sendKeys("dsm1g11");
		passinput.sendKeys(
				"T~CC00QtwIsysG9hJEf+4wi99k;EF1oT1!5<DMQI:7UdH!clozQ}/h=WNgLTvCHzqOka=v/7HmkixxkEQuh26QDkEW.IYriw(RxU");
		driver.findElement(By.className("btn")).click();

		File f = new File("browser.data");

		BufferedWriter bos;

		try {
			f.delete();
			f.createNewFile();

			bos = new BufferedWriter(new FileWriter(f));

			for (org.openqa.selenium.Cookie ck : driver.manage().getCookies()) {

				bos.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				bos.newLine();
				bos.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/form/a")));
		WebElement logoutin = driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/a"));
		logoutin.submit();

		BufferedReader br;
		try {
			File fr = new File("browser.data");   

			br = new BufferedReader(new FileReader(fr));

			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(line, ";");
				while (str.hasMoreTokens()) {
					String name = str.nextToken();
					String value = str.nextToken();
					String domain = str.nextToken();
					String path = str.nextToken();
					Date expiry = null;
					String dt;

					if (!(dt = str.nextToken()).equals("null")) {
						expiry = new Date(dt);
					}
					boolean isSecure = new Boolean(str.nextToken()).booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
					driver.manage().addCookie(ck);
				}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}