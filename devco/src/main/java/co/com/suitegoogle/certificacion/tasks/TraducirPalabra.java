package co.com.suitegoogle.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.suitegoogle.certificacion.userinterface.traducirPalabraPage.CUADRO_ESPERA;
import static co.com.suitegoogle.certificacion.userinterface.traducirPalabraPage.TXT_PALABRA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TraducirPalabra implements Task {

    private String descripcion;

    public TraducirPalabra(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(TXT_PALABRA).thenHit(Keys.ENTER),
                WaitUntil.the(CUADRO_ESPERA,isVisible())
        );
    }

    public static TraducirPalabra con(String descripcion){
        return Tasks.instrumented(TraducirPalabra.class,descripcion);
    }
}
