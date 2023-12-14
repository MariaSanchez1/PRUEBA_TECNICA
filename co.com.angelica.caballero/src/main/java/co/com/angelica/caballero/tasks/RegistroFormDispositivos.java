package co.com.angelica.caballero.tasks;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class RegistroFormDispositivos implements Task {
    private Datos datos;

    public RegistroFormDispositivos(Datos datos) {
        this.datos = datos;
    }

    public static RegistroFormDispositivos llenarFormDispositivos(Datos datos) {
        return Tasks.instrumented(RegistroFormDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroUsuarioPage.SPAN_COMPUTADOR),
                Enter.theValue(datos.getComputador()).into(RegistroUsuarioPage.INPUT_COMPUTADOR),
                Click.on(RegistroUsuarioPage.SELECT_PRIMERA_OP),

                Click.on(RegistroUsuarioPage.SPAN_VERSION),
                Enter.theValue(datos.getVersion()).into(RegistroUsuarioPage.INPUT_VERSION),
                Click.on(RegistroUsuarioPage.SELECT_PRIMERA_OP),

                Click.on(RegistroUsuarioPage.SPAN_LENGUAJE2),
                Enter.theValue(datos.getLenguaje2()).into(RegistroUsuarioPage.INPUT_LENGUAJE2),
                Click.on(RegistroUsuarioPage.SELECT_PRIMERA_OP),

                Scroll.to(RegistroUsuarioPage.SPAN_DISP_MOBILE),
                Click.on(RegistroUsuarioPage.SPAN_DISP_MOBILE),
                Enter.theValue(datos.getDispositivo()).into(RegistroUsuarioPage.INPUT_DISP_MOBILE),
                Click.on(RegistroUsuarioPage.SELECT_PRIMERA_OP),

                Click.on(RegistroUsuarioPage.SPAN_MODELO),
                Enter.theValue(datos.getModelo()).into(RegistroUsuarioPage.INPUT_MODELO),
                Click.on(RegistroUsuarioPage.SELECT_PRIMERA_OP),

                Click.on(RegistroUsuarioPage.SPAN_SISTEMA_OP),
                Enter.theValue(datos.getSistema_operativo()).into(RegistroUsuarioPage.INPUT_SISTEMA_OP),
                Click.on(RegistroUsuarioPage.SELECT_PRIMERA_OP),
                Click.on(RegistroUsuarioPage.BTN_SIGUIENTE_CONTRASENA)

        );
    }
}
