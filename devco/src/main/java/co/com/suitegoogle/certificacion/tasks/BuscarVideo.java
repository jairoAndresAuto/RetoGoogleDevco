package co.com.suitegoogle.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static co.com.suitegoogle.certificacion.userinterface.BuscarVideoPage.TXT_VIDEO_BUSQUEDA;


public class BuscarVideo implements Task {

    private String descripcion;

    public BuscarVideo(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_VIDEO_BUSQUEDA,isEnabled())
        );
        try {
            Thread.sleep(3000);
            Thread.interrupted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(descripcion).into(TXT_VIDEO_BUSQUEDA).thenHit(Keys.ENTER));
    }

    public static BuscarVideo con(String descripcion){
        return Tasks.instrumented(BuscarVideo.class,descripcion);
    }
}
