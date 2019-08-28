package co.com.psstv.TN_Pruebaz_.drivers;

import static co.com.psstv.TN_Pruebaz_.utils.Constantes.ADD_ARGUMENTS_MAXIMIZED;
import static co.com.psstv.TN_Pruebaz_.utils.Constantes.ADD_DISABLE_INFOBARDS;
import static co.com.psstv.TN_Pruebaz_.utils.Constantes.WEB_DRIVER_CHROME;
import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import co.com.psstv.TN_Pruebaz_.utils.Property;

public class OwnChromeDriver {

	private static WebDriver driver = null;

	public static WebDriver hisDriver() {
		Property.load();
		System.setProperty(WEB_DRIVER_CHROME, Property.getPROP().getProperty(Property.getRutaChromeDriver()));
		ChromeOptions options = new ChromeOptions();
		options.addArguments(ADD_ARGUMENTS_MAXIMIZED);
		options.addArguments(ADD_DISABLE_INFOBARDS);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, SECONDS);
		driver.get(Property.getPROP().getProperty(Property.getUrl()));
		return driver;
	}

	public static WebDriver closeDriver() {

		if (driver != null) {
			driver.close();
		}

		return driver;

	}

}
