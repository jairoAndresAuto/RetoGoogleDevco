package co.com.suitegoogle.certificacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class traducirPalabraPage {

    public static final Target TXT_PALABRA=Target.the("palabra a traducir").located(By.xpath("//textarea"));
    public static final Target CUADRO_ESPERA=Target.the("cuadro a esperar").located(By.xpath("//div[@class='Dwvecf']"));
    public static final Target TXT_PALABRA_TRADUCIDA=Target.the("palabra traducida").located(By.xpath("//span[contains(.,'Hola')]"));





}
