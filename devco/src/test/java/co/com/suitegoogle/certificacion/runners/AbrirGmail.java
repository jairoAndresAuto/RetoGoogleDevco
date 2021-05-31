package co.com.suitegoogle.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.suitegoogle.certificacion.stepdefinitions.casospruebamanual",
        features = "src/test/resources/features/Suite_google_manual.feature",
        snippets = SnippetType.CAMELCASE
)
public class AbrirGmail {
}
