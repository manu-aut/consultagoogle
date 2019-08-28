package co.com.psstv.TN_Pruebaz_.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Property {

	public Property() {
		throw new IllegalArgumentException("Propiedad no encontrada");
	}

	protected static Properties PROP = new Properties();
	private static final String URL = "URL";
	private static final String RUTA_CHROME_DRIVER = "ruta.chromedriver";

	public static String getRutaChromeDriver() {
		return RUTA_CHROME_DRIVER;
	}

	public static Properties getPROP() {
		return PROP;
	}

	public static String getUrl() {
		return URL;
	}

	public static void load() {

		PROP = new Properties();
		try {
			InputStream inputStream = new FileInputStream("./serenity.properties");
			PROP.load(inputStream);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (System.getProperty(URL) != null) {
			PROP.setProperty(URL, PROP.getProperty(URL));
		}

		if (System.getProperty(RUTA_CHROME_DRIVER) != null) {
			PROP.setProperty(RUTA_CHROME_DRIVER, PROP.getProperty(RUTA_CHROME_DRIVER));
		}

	}

}
