package co.com.suitegoogle.certificacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarDireccionPage {

    public static final Target BTN_RESTAURANTE=Target.the("Selecccionar restaurantes").located(By.xpath("(//button[@jstcache='704'])[1]"));
    public static final Target LBL_TIENDA= Target.the("restaurante a buscar").locatedBy("//span[contains(.,'{0}')]");

}
