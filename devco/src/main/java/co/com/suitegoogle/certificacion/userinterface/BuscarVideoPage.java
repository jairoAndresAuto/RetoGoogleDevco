package co.com.suitegoogle.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarVideoPage {

    public static final Target TXT_VIDEO_BUSQUEDA= Target.the("video de busqeuda").located(By.xpath("//input[@id='search']"));
    public static final Target LBL_VIDEO= Target.the("etiqueta nombre video").located(By.xpath("//span[contains(.,'Curso de programación JAVA desde cero')]"));

}
