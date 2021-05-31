package co.com.suitegoogle.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarEscenarioManual implements Question<Boolean> {

    private String descripcion;

    public ValidarEscenarioManual(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje="Exitoso";
        return mensaje.equals(descripcion);
    }

    public static ValidarEscenarioManual con(String descripcion) {
        return new ValidarEscenarioManual(descripcion);
    }

}
