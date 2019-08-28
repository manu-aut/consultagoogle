package co.com.psstv.TN_Pruebaz_.tasks;

import static co.com.psstv.TN_Pruebaz_.userinterface.GoogleSearchPage.INPUT_SEARCH;
import static co.com.psstv.TN_Pruebaz_.userinterface.GoogleSearchPage.LINK_TEXT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import java.util.List;

import co.com.psstv.TN_Pruebaz_.models.DatosGoogleSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Escribir implements Task {

	private DatosGoogleSearch datosGoogle;
	private Actor actor;

	public Escribir(List<DatosGoogleSearch> datosGoogle) {
		this.datosGoogle = datosGoogle.get(0);
	}

	@Step("{0} escribe la palabra incorrecta")
	@Override
	public <T extends Actor> void performAs(T actor) {
		this.actor = actor;
		actor.attemptsTo(Enter.theValue(datosGoogle.getPalabra()).into(INPUT_SEARCH).thenHit(ENTER));
		if (sugerencia()) {
			actor.attemptsTo(Click.on(LINK_TEXT));
		}

	}

	private Boolean sugerencia() {
		LINK_TEXT.resolveFor(actor).containsText("pruebas");
		return true;
	}

	public static Escribir laPalabraIncorrecta(List<DatosGoogleSearch> datosGoogle) {
		return instrumented(Escribir.class, datosGoogle);
	}

}