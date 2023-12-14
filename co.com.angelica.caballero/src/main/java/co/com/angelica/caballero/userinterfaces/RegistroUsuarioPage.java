package co.com.angelica.caballero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuarioPage {

    public static final Target BTN_JOIN_TODAY= Target.the("boton para ingresar al formulario de registro usuario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NOMBRE= Target.the("input de nombre").located(By.cssSelector("#firstName"));
    public static final Target INPUT_APELLIDO= Target.the("input de apellido").located(By.cssSelector("#lastName"));
    public static final Target INPUT_CORREO= Target.the("input de correo").located(By.cssSelector("#email"));
    public static final Target SELECT_MES= Target.the("select de mes").located(By.cssSelector("#birthMonth"));
    public static final Target SELECT_DIA= Target.the("select de dia").located(By.cssSelector("#birthDay"));
    public static final Target SELECT_YEAR= Target.the("select de year").located(By.cssSelector("#birthYear"));
    public static final Target INPUT_LENGUAJE= Target.the("input de lenguaje").located(By.xpath("//input[@aria-label='Select box']"));
    public static final Target SELECT_LENGUAJE= Target.the("select de lenguaje").located(By.cssSelector("#ui-select-choices-row-0-0"));
    public static final Target BTN_SIGUIENTE_DIRECCION= Target.the("boton next para continuar").located(By.xpath("//*[normalize-space()='Next: Location']//ancestor::a"));

    public static final Target BTN_LIMPIAR_CIUDAD= Target.the("input de ciudad").located(By.xpath("//button[@class='clear-btn']"));
    public static final Target INPUT_CIUDAD= Target.the("input de ciudad").located(By.xpath("//div[@class='wrapper']//input"));
    public static final Target SELECT_CIUDAD= Target.the("select de ciudad").located(By.xpath("//ngf-options-container//child::div[1]"));
    public static final Target INPUT_COD_POSTAL= Target.the("input de Codigo Postal").located(By.cssSelector("#zip"));
    public static final Target SELECT_PAIS= Target.the("select de pais").located(By.xpath("(//SPAN[@class='ui-select-choices-row-inner'])[1]"));
    public static final Target SPAN_PAIS= Target.the("span de pais").located(By.xpath("//span[@aria-label='Select a country']"));
    public static final Target INPUT_PAIS= Target.the("input de pais").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BTN_SIGUIENTE_DISPOSITIVOS= Target.the("boton next para continuar").located(By.xpath("//*[normalize-space()='Next: Devices']//ancestor::a"));

    public static final Target SPAN_COMPUTADOR= Target.the("span de computador").located(By.xpath("(//*[contains(@class, 'ui-select-toggle')])[1]"));
    public static final Target INPUT_COMPUTADOR= Target.the("input de computador").located(By.xpath("(//input[@placeholder='Select OS'])[1]"));
    public static final Target SELECT_PRIMERA_OP= Target.the("primera opcion del select").located(By.xpath("(//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//child::span)[1]"));

    public static final Target SPAN_VERSION= Target.the("span de Version").located(By.xpath("(//*[contains(@class, 'ui-select-toggle')])[2]"));
    public static final Target INPUT_VERSION= Target.the("input de Version").located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target SPAN_LENGUAJE2= Target.the("span de lenguaje").located(By.xpath("(//*[contains(@class, 'ui-select-toggle')])[3]"));
    public static final Target INPUT_LENGUAJE2= Target.the("input de lenguaje").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target SPAN_DISP_MOBILE= Target.the("span de Dispositivo mobile").located(By.xpath("(//*[contains(@class, 'ui-select-toggle')])[4]"));
    public static final Target INPUT_DISP_MOBILE= Target.the("input de Dispositivo mobile").located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target SPAN_MODELO= Target.the("span de Modelo").located(By.xpath("(//*[contains(@class, 'ui-select-toggle')])[5]"));
    public static final Target INPUT_MODELO= Target.the("input de Modelo").located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target SPAN_SISTEMA_OP= Target.the("span de Sistema Operativo").located(By.xpath("(//*[contains(@class, 'ui-select-toggle')])[6]"));
    public static final Target INPUT_SISTEMA_OP= Target.the("input de Sistema Operativo").located(By.xpath("(//input[@placeholder='Select OS'])[2]"));

    public static final Target BTN_SIGUIENTE_CONTRASENA= Target.the("boton next para contrasena").located(By.xpath("//*[normalize-space()='Next: Last Step']//ancestor::a"));
    public static final Target INPUT_CONTRASENA= Target.the("input de contrasena").located(By.cssSelector("#password"));
    public static final Target INPUT_CONFIRMAR_CONTRASENA= Target.the("input de confirmar contrasena").located(By.cssSelector("#confirmPassword"));
    public static final Target CHECK_ACEPTAR_MANTENER_INFORMADO= Target.the("check de aceptar mantener informado").located(By.xpath("//*[contains(text(),' STAY INFORMED! ')]//ancestor::label"));
    public static final Target CHECK_ACEPTAR_DIRECTICES_UTEST= Target.the("check de aceptar directrices de Utest").located(By.xpath("//*[contains(text(),'uTest Terms of Use')]//ancestor::label"));
    public static final Target CHECK_ACEPTAR_POLITICAS_SYP= Target.the("check de aceptar politicas de seguridad y privacidad").located(By.xpath("//*[contains(text(),'Privacy & Security Policy')]//ancestor::label//child::span[1]"));

    public static final Target BTN_REGISTRO_COMPLETO= Target.the("boton de finalizar registro").located(By.cssSelector("#laddaBtn"));

    public static final Target TITULO_BIENVENIDA= Target.the("Card de bienvenidad").located(By.xpath("//div[@class='image-box-header']//h1"));

}

