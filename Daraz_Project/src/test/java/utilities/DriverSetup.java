package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	private static String browserName = System.getProperty("browser", "Chrome");
	private static final ThreadLocal<WebDriver> DRIVER_LOCAL = new ThreadLocal<>();

	public static WebDriver getDriver() {

		return DRIVER_LOCAL.get();
	}

	public static void setDriver(WebDriver driver) {
		DriverSetup.DRIVER_LOCAL.set(driver);

	}

	public static WebDriver getBrowser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();

		case "edge":
			WebDriverManager.chromedriver().setup();
			return new EdgeDriver();

		case "firefox":
			WebDriverManager.chromedriver().setup();
			return new FirefoxDriver();

		default:
			throw new RuntimeException("Browser Not Found");
		}

	}

	@BeforeSuite
	public static synchronized void setBrowser() {
		WebDriver WebDriver = getBrowser(browserName);
		WebDriver.manage().window().maximize();
		setDriver(WebDriver);

	}

	@AfterSuite
	public static synchronized void quitBrowser() {
		// getDriver().quit();

	}
}
