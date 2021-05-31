package co.com.suitegoogle.certificacion.stepdefinitions.casospruebaauto;

import co.com.suitegoogle.certificacion.questions.ValidateTarget;
import co.com.suitegoogle.certificacion.tasks.BuscarDato;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.suitegoogle.certificacion.userinterface.BuscarDatoPage.LBL_MENSAJE_LDS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarDatoStepDefinitions {

    @Cuando("^procedo a buscar una palabra$")
    public void procedoABuscarUnaPalabra() {
        theActorInTheSpotlight().attemptsTo(BuscarDato.conSiguiente("Los del sur"));
    }


    @Entonces("^Observo titulos relaciónados con la palabra ingresada \"([^\"]*)\"$")
    public void observoTitulosRelaciónadosConLaPalabraIngresada(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidateTarget.attach(mensaje, LBL_MENSAJE_LDS)));
    }
}
