package co.com.suitegoogle.certificacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarDatoPage {

    public static final Target TXT_BUSCAR=Target.the("campo buscar dato").located(By.name("q"));
    public static final Target LBL_MENSAJE_LDS=Target.the("Mensaje a validar buscar dato").located(By.xpath("(//span[contains(.,'Los Del Sur')])[13]"));

}
