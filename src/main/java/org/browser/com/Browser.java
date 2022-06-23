package org.browser.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.properties.com.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
	public static  Actions act;
	public WebDriverWait wait;
	
	public static void setDriver() throws Exception {
		try {
			Prop.setupProperties();
			String driverName = Prop.getProperty("browser");
			switch (driverName.toLowerCase()) {
				case "chrome":
					setChromeDriver();
					break;
				case "firefox":
					setFireFoxDriver();
					break;
				case "edge":
					setEdgeDriver();
					break;
				default:
					break;
			}			
		} catch (Exception e) {
			 System.out.println("In "+ new Object() {}.getClass().getEnclosingMethod().getName() +" Method");
			 System.out.println(e);
		}
		act = new Actions(driver);
	}
	
	private static void setFireFoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	private static void setEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	private static void setChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void getUrl() {
		driver.get(Prop.getProperty("url"));
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public void moveCursorTo(WebElement element) {
		act.moveToElement(element).build().perform();
	}
	
	public void implycitWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void waitForElement(WebElement element,long seconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void sleep(long time) throws Exception {
		Thread.sleep(time);
	}
}
