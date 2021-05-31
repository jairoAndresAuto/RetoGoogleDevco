package co.com.suitegoogle.certificacion.stepdefinitions.casospruebaauto;

import co.com.suitegoogle.certificacion.questions.ValidateTarget;
import co.com.suitegoogle.certificacion.tasks.BuscarDireccion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.suitegoogle.certificacion.userinterface.BuscarDireccionPage.LBL_TIENDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarUbicacionStepDefinitions {


    @Cuando("^ingreso selecciono Tiendas$")
    public void ingresoSeleccionoTiendas() {
         theActorInTheSpotlight().attemptsTo(BuscarDireccion.restaurante());
    }


    @Entonces("^verifica un nombre de Tienda llamada \"([^\"]*)\"$")
    public void verificaUnNombreDeTiendaLlamada(String nombrTienda) {
        theActorInTheSpotlight().should(seeThat(ValidateTarget.attach(nombrTienda, LBL_TIENDA.of(nombrTienda))));
    }

}
