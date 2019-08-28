package co.com.psstv.TN_Pruebaz_.questions;

import static co.com.psstv.TN_Pruebaz_.userinterface.ResultsFirstPage.ITEMS_FIRST_PAGE;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FirstPageResults implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {
		for (WebElementFacade element : ITEMS_FIRST_PAGE.resolveAllFor(actor)) {
			System.out.println("the search results: " + element.getText());
		}
		return ITEMS_FIRST_PAGE.resolveAllFor(actor).size();
	}

	public static Question<Integer> displayed() {
		return new FirstPageResults();
	}

}
