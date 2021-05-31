package co.com.suitegoogle.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.suitegoogle.certificacion.userinterface.BuscarDatoPage.TXT_BUSCAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class BuscarDato implements Task{

    private String descripción;

    public BuscarDato(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_BUSCAR,isEnabled()),
                Enter.theValue(descripción).into(TXT_BUSCAR).thenHit(Keys.ENTER)
                );
    }

    public static BuscarDato conSiguiente(String descripción){
        return Tasks.instrumented(BuscarDato.class,descripción);
    }

}
