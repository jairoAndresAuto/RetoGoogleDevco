package co.com.suitegoogle.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.suitegoogle.certificacion.userinterface.BuscarDireccionPage.BTN_RESTAURANTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class BuscarDireccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               WaitUntil.the(BTN_RESTAURANTE,isClickable()),
                       Click.on(BTN_RESTAURANTE)
       );
    }

    public static BuscarDireccion restaurante(){
        return Tasks.instrumented(BuscarDireccion.class);
    }
}
