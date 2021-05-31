package co.com.suitegoogle.certificacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class MenuPage {

    public static final Target BTN_SUITE_GOOGLE=Target.the("boton suite google").located(By.xpath("//a[@class='gb_C']"));

    public static final IFrame IFRAME= IFrame.withPath(By.xpath("//iframe"));
    public static final Target BTN_OPCION_GOOGLE=Target.the("boton suite google").inIFrame(IFRAME).locatedBy("//span[contains(.,'{0}')]/..//span");
}
