package co.com.suitegoogle.certificacion.stepdefinitions.casospruebaauto;
import static co.com.suitegoogle.certificacion.userinterface.traducirPalabraPage.TXT_PALABRA_TRADUCIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.suitegoogle.certificacion.questions.ValidateTarget;
import co.com.suitegoogle.certificacion.tasks.TraducirPalabra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

public class TraducirDatoStepDefinitions {

    @Cuando("^ingreso la palabra \"([^\"]*)\"$")
    public void ingresoLaPalabra(String palabraATraducir) {
        theActorInTheSpotlight().attemptsTo(TraducirPalabra.con(palabraATraducir));
    }


    @Entonces("^verifica la traduccion \"([^\"]*)\"$")
    public void verificaLaTraduccion(String palabraTraducida) {
        theActorInTheSpotlight().should(seeThat(ValidateTarget.attach(palabraTraducida, TXT_PALABRA_TRADUCIDA)));
    }


}
