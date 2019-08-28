package co.com.psstv.TN_Pruebaz_.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/cucumbers/hu_google_result.feature", glue = "co\\com\\psstv\\TN_Pruebaz_\\stepdefinitions", snippets = CAMELCASE)
public class GoogleResult {

}
