package co.com.psstv.TN_Pruebaz_.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheSuggestion implements Question<Boolean> {

	private String sugerencia;

	public TheSuggestion(String sugerencia) {
		this.sugerencia = sugerencia;

	}

	@Override
	public Boolean answeredBy(Actor actor) {
//		jaja
		return Target.the(sugerencia).locatedBy("//*[contains(.,'" + sugerencia + "')]").resolveFor(actor).isVisible();
	}

}
