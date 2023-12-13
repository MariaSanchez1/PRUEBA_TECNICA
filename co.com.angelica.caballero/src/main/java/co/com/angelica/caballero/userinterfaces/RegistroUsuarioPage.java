package co.com.angelica.caballero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuarioPage {

    public static final Target BTN_JOIN_TODAY= Target.the("boton para ingresar al formulario de registro usuario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NOMBRE= Target.the("input de nombre").located(By.cssSelector("#firstName"));
    public static final Target INPUT_APELLIDO= Target.the("input de apellido").located(By.cssSelector("#lastName"));
    public static final Target INPUT_CORREO= Target.the("input de correo").located(By.cssSelector("#email"));
    public static final Target SELECT_MES= Target.the("input de mes").located(By.cssSelector("#birthMonth"));
    public static final Target SELECT_DIA= Target.the("input de dia").located(By.cssSelector("#birthDay"));
    public static final Target SELECT_YEAR= Target.the("input de year").located(By.cssSelector("#birthYear"));
    public static final Target INPUT_LENGUAJE= Target.the("input de lenguaje").located(By.xpath("//input[@aria-label='Select box']"));
    public static final Target SELECT_LENGUAJE= Target.the("select de lenguaje").located(By.cssSelector("#ui-select-choices-row-0-0"));
    public static final Target BTN_SIGUIENTE= Target.the("boton next para continuar").located(By.xpath("//*[normalize-space()='Next: Location']//ancestor::a"));
}

