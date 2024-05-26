package Core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;

			case CHROME:
				System.setProperty("webdriver.chrome.driver", "/Users/carlosalberto/WebDrivers/chromedriver");

				driver = new ChromeDriver();
				break;

			case EDGE:
				driver = new EdgeDriver();
				break;

			}
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			getDriver().get("https://www.saucedemo.com");
		}
		return driver;
	}
//    public static void killDriver(){
//        if(driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
}