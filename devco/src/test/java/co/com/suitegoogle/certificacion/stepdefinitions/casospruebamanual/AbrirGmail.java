package co.com.suitegoogle.certificacion.stepdefinitions.casospruebamanual;

import co.com.suitegoogle.certificacion.questions.ValidarEscenarioManual;
import co.com.suitegoogle.certificacion.stepdefinitions.GeneralStepDefinitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirGmail extends GeneralStepDefinitions {

    @Dado("^me encuentro en la pagina de google manual$")
    public void meEncuentroEnLaPaginaDeGoogleManual() {
        setUp();
    }

    @Cuando("^procedo abrir la suite de google y dar clic en la opcion \"([^\"]*)\"$")
    public void procedoAbrirLaSuiteDeGoogleYDarClicEnLaOpcion(String arg1) {

    }

    @Cuando("^ingreso clave y contraseña$")
    public void ingresoClaveYContraseña() {

    }


    @Entonces("^verifica que se inicie la sesión \"([^\"]*)\"$")
    public void verifica_que_se_inicie_la_sesión(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarEscenarioManual.con(mensaje)));
    }
}
