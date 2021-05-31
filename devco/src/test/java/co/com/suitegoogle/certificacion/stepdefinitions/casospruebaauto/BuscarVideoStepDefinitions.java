package co.com.suitegoogle.certificacion.stepdefinitions.casospruebaauto;
import static co.com.suitegoogle.certificacion.userinterface.BuscarVideoPage.LBL_VIDEO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.suitegoogle.certificacion.questions.ValidateTarget;
import co.com.suitegoogle.certificacion.tasks.BuscarVideo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

public class BuscarVideoStepDefinitions {

    @Cuando("^ingreso el nombre del video \"([^\"]*)\"$")
    public void ingresoElNombreDelVideo(String nombreVideo) {
      theActorInTheSpotlight().attemptsTo(BuscarVideo.con(nombreVideo));
    }


    @Entonces("^verifica el titulo del video \"([^\"]*)\"$")
    public void verificaElTituloDelVideo(String nombreVideo) {
        theActorInTheSpotlight().should(seeThat(ValidateTarget.attach(nombreVideo, LBL_VIDEO)));
    }

}
