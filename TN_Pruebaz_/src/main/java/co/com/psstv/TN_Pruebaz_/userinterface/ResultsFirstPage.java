package co.com.psstv.TN_Pruebaz_.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ResultsFirstPage {

	// css selector para que no me escale
	public static final Target ITEMS_FIRST_PAGE = Target.the("resultados de la primera pagina bebe")
			.located(By.className("g"));
	// relativos conexpresiones regulares wow
	public static final Target LISTA_RESULTADOS = Target.the("Lista de resultados").locatedBy("//div[@class='g']");

}
