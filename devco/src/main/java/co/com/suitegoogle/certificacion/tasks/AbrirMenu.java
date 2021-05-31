package co.com.suitegoogle.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static co.com.suitegoogle.certificacion.userinterface.MenuPage.BTN_OPCION_GOOGLE;
import static co.com.suitegoogle.certificacion.userinterface.MenuPage.BTN_SUITE_GOOGLE;

public class AbrirMenu implements Task {

    private String opcion;

    public AbrirMenu(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SUITE_GOOGLE)
        );
        actor.attemptsTo(
                WaitUntil.the(BTN_OPCION_GOOGLE.of(opcion), isClickable()),
                Click.on(BTN_OPCION_GOOGLE.of(opcion))
        );
    }

    public static AbrirMenu con(String opcion){
        return Tasks.instrumented(AbrirMenu.class,opcion);
    }
}
