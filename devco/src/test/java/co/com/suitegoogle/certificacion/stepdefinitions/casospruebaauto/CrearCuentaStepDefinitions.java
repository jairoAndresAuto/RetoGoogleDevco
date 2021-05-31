package co.com.suitegoogle.certificacion.stepdefinitions.casospruebaauto;

import co.com.suitegoogle.certificacion.questions.ValidateTarget;
import co.com.suitegoogle.certificacion.stepdefinitions.GeneralStepDefinitions;
import co.com.suitegoogle.certificacion.tasks.AbrirMenu;
import co.com.suitegoogle.certificacion.tasks.CrearCuenta;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.suitegoogle.certificacion.userinterface.CrearCuentaPage.LBL_MENSAJE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearCuentaStepDefinitions extends GeneralStepDefinitions {

    @Dado("^me encuentro en la pagina de google$")
    public void meEncuentroEnLaPaginaDeGoogle() {
      setUp("https://www.google.com.co/");
    }

    /*--------------------------------------------------------------------------------------------*/

    @Cuando("^procedo abrir la suite de google y dar clic en la opcion \"([^\"]*)\"$")
    public void procedoAbrirLaSuiteDeGoogleYDarClicEnLaOpcion(String opcionMenu) {
        theActorInTheSpotlight().attemptsTo(AbrirMenu.con(opcionMenu));
    }

    @Cuando("^Procedemos a crear una cuenta nueva llenamos los datos$")
    public void procedemosACrearUnaCuentaNuevaLlenamosLosDatos(List<Map<String,String>> datos) {
        theActorInTheSpotlight().attemptsTo(CrearCuenta.con(datos));
    }

    @Entonces("^Verifico el mensaje mensaje \"([^\"]*)\"$")
    public void verificoElMensajeMensaje(String mensajeAValidar) {
        theActorInTheSpotlight().should(seeThat(ValidateTarget.attach(mensajeAValidar, LBL_MENSAJE)));
    }

}
