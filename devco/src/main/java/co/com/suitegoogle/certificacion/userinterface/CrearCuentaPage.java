package co.com.suitegoogle.certificacion.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CrearCuentaPage  {

    public static final Target BTN_CREAR_CUENTA=Target.the("boton crear cuenta").located(By.xpath("//a[contains(.,'Crear una cuenta')]"));
    public static final Target TXT_NOMBRE=Target.the("nombre cuenta").located(By.id("firstName"));
    public static final Target TXT_APELLIDO=Target.the("apellido cuenta").located(By.id("lastName"));
    public static final Target TXT_NAMEUSER=Target.the("nombre de usuario cuenta").located(By.id("username"));
    public static final Target TXT_PASSWORD=Target.the("contraseña cuenta").located(By.name("Passwd"));
    public static final Target TXT_PASSWORD_CONFIRM=Target.the("confirmar contraseña cuenta").located(By.name("ConfirmPasswd"));
    public static final Target LBL_MENSAJE=Target.the("Mensaje a validar crear cuenta").located(By.xpath("//figcaption"));

}
