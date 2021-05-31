package co.com.suitegoogle.certificacion.runners.Casos;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.suitegoogle.certificacion.stepdefinitions.casospruebamanual",
        features = "src/test/resources/features/Suite_google_manual.feature"
)
public class SuiteCasosManual {
}
