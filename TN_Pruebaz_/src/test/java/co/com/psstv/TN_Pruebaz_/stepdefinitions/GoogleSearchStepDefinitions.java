package co.com.psstv.TN_Pruebaz_.stepdefinitions;

import static co.com.psstv.TN_Pruebaz_.questions.AndValidate.theSuggestion;
import static co.com.psstv.TN_Pruebaz_.questions.FirstPageResults.displayed;
import static co.com.psstv.TN_Pruebaz_.tasks.Escribir.laPalabraIncorrecta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.greaterThan;

import java.util.List;

import co.com.psstv.TN_Pruebaz_.models.DatosGoogleSearch;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStepDefinitions {

	@When("^se escribe la palabra$")
	public void seEscribeLaPalabra(List<DatosGoogleSearch> datosGoogle) {
		theActorInTheSpotlight().attemptsTo(laPalabraIncorrecta(datosGoogle));

	}

	@And("^se valida la sugerencia como (.*)$")
	public void seValidaLaPalabraCorrectaPruebas(String sugerencia) {
		theActorInTheSpotlight().should(seeThat(theSuggestion(sugerencia)));
	}

	@Then("^el visualizaria que la cantidad del resultado es mayor que (.*)$")
	public void elVisualizariaQueLaCantidadDelResultadoEsMayorQue(int items) {
		theActorInTheSpotlight().should(seeThat(displayed(), greaterThan(items)));

	}

}
