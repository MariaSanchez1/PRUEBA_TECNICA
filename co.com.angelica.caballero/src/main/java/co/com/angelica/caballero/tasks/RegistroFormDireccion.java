package co.com.angelica.caballero.tasks;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class RegistroFormDireccion implements Task {

    private Datos datos;

    public RegistroFormDireccion(Datos datos) {
        this.datos = datos;
    }

    public static RegistroFormDireccion llenarFormDireccion(Datos datos) {
        return Tasks.instrumented(RegistroFormDireccion.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroUsuarioPage.BTN_LIMPIAR_CIUDAD),
                Enter.theValue(datos.getCiudad()).into(RegistroUsuarioPage.INPUT_CIUDAD),
                Click.on(RegistroUsuarioPage.SELECT_CIUDAD),
                Scroll.to(RegistroUsuarioPage.INPUT_COD_POSTAL),
                Enter.theValue(datos.getCod_postal()).into(RegistroUsuarioPage.INPUT_COD_POSTAL),
                Click.on(RegistroUsuarioPage.SPAN_PAIS),
                Enter.theValue(datos.getPais()).into(RegistroUsuarioPage.INPUT_PAIS),
                Click.on(RegistroUsuarioPage.SELECT_PAIS),
                Click.on(RegistroUsuarioPage.BTN_SIGUIENTE_DISPOSITIVOS)

        );
    }
}
