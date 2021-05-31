package co.com.suitegoogle.certificacion.tasks;

import co.com.suitegoogle.certificacion.userinterface.CrearCuentaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.suitegoogle.certificacion.userinterface.CrearCuentaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CrearCuenta implements Task {

    private List<Map<String,String>> datos;

    public CrearCuenta(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CREAR_CUENTA,isClickable()),
                Click.on(BTN_CREAR_CUENTA),
                Enter.theValue(datos.get(0).get("nombre")).into(TXT_NOMBRE),
                Enter.theValue(datos.get(0).get("apellido")).into(TXT_APELLIDO),
                Enter.theValue(datos.get(0).get("username")).into(TXT_NAMEUSER) ,
                Enter.theValue(datos.get(0).get("contrasena")).into(TXT_PASSWORD)  ,
                Enter.theValue(datos.get(0).get("contrasena")).into(TXT_PASSWORD_CONFIRM)
        );
    }

    public static CrearCuenta con(List<Map<String,String>> datos){
        return Tasks.instrumented(CrearCuenta.class,datos);
    }
}
