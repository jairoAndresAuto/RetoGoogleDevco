package co.com.suitegoogle.certificacion.runners.Casos;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.suitegoogle.certificacion.stepdefinitions.casospruebaauto",
        features = "src/test/resources/features/suite_google.feature"
)
public class SuiteCasosAuto {
}
