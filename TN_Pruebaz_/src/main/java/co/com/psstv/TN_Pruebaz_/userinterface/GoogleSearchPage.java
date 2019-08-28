package co.com.psstv.TN_Pruebaz_.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.name;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleSearchPage {

	public static final Target INPUT_SEARCH = the("Input busqueda").located(name("q"));
//	xpath relativo lo mejor.
	public static final Target LBL_RELATIVO = the("label no se que..").locatedBy("//a[@class='gL9Hy']//i[1]");
//	ahh.. es que el xpath es una mala practica bla bla bla.. entonces cssselector
	public static final Target LINK_TEXT = the("cssSelectorSelenium").located(By.partialLinkText("pruebas"));


}
