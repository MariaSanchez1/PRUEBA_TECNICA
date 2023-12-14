package co.com.angelica.caballero.tasks;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.userinterfaces.RegistroUsuarioPage;
import co.com.angelica.caballero.utils.ModificarCorreo;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;




public class RegistroFormCuentanosDeTi implements Task {
  private Datos datos;
  private ModificarCorreo modificarCorreo;
  public RegistroFormCuentanosDeTi(Datos datos) {
    this.datos = datos;
  }

  public static RegistroFormCuentanosDeTi llenarFormCuentanosDeTi(Datos datos) {
    return Tasks.instrumented(RegistroFormCuentanosDeTi.class,datos);
  }


  @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(datos.getNombre()).into(RegistroUsuarioPage.INPUT_NOMBRE),
            Enter.theValue(datos.getApellido()).into(RegistroUsuarioPage.INPUT_APELLIDO),
            Enter.theValue(modificarCorreo.numAleatorio(datos.getCorreo())).into(RegistroUsuarioPage.INPUT_CORREO),
            SelectFromOptions.byVisibleText(datos.getMes()).from(RegistroUsuarioPage.SELECT_MES),
            SelectFromOptions.byVisibleText(datos.getDia()).from(RegistroUsuarioPage.SELECT_DIA),
            Scroll.to(RegistroUsuarioPage.SELECT_YEAR),
            SelectFromOptions.byVisibleText(datos.getYear()).from(RegistroUsuarioPage.SELECT_YEAR),
            Enter.theValue(datos.getLenguaje()).into(RegistroUsuarioPage.INPUT_LENGUAJE),
            Click.on(RegistroUsuarioPage.SELECT_LENGUAJE),
            Click.on(RegistroUsuarioPage.BTN_SIGUIENTE_DIRECCION)

    );

    }

}
