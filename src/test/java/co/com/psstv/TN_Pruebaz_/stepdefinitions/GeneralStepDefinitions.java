package co.com.psstv.TN_Pruebaz_.stepdefinitions;

import static co.com.psstv.TN_Pruebaz_.drivers.OwnChromeDriver.hisDriver;
import static co.com.psstv.TN_Pruebaz_.utils.Constantes.CHROME_STUP_USER_;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.with;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.psstv.TN_Pruebaz_.drivers.OwnChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GeneralStepDefinitions {

	@Before
	public void openBrowser() {
		setTheStage(new OnlineCast());
		theActorCalled(CHROME_STUP_USER_).can(with(hisDriver()));

	}

	@After
	public void closeDriver() {
		theActorInTheSpotlight().can(with(OwnChromeDriver.closeDriver()));
	}

}
