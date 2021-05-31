package co.com.suitegoogle.certificacion.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateTarget implements Question<Boolean> {

    private String descripcion;
    Target target;

    public ValidateTarget(String descripcion, Target target){
        this.descripcion = descripcion;
        this.target=target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
            actor.attemptsTo(WaitUntil.the(target,isVisible()));
            return Text.of(target).viewedBy(actor).asString().contains(descripcion);
    }

    public static ValidateTarget attach(String descripcion, Target target) {
        return new ValidateTarget(descripcion,target);
    }
}
