package co.com.suitegoogle.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@BuscarDato",
        glue = "co.com.suitegoogle.certificacion.stepdefinitions.casosprueba",
        features = "src/test/resources/features/suite_google.feature",
        snippets = SnippetType.CAMELCASE
)
public class BuscarDatoRunner {
}