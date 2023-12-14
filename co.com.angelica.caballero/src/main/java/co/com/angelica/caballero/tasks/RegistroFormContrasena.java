package co.com.angelica.caballero.tasks;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistroFormContrasena implements Task {
    private Datos datos;

    public RegistroFormContrasena(Datos datos) {
        this.datos = datos;
    }

    public static RegistroFormContrasena llenarFormContrasena(Datos datos) {
        return Tasks.instrumented(RegistroFormContrasena.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getContrasena()).into(RegistroUsuarioPage.INPUT_CONTRASENA),
                Enter.theValue(datos.getConfirmar_contrasena()).into(RegistroUsuarioPage.INPUT_CONFIRMAR_CONTRASENA),
                Scroll.to(RegistroUsuarioPage.CHECK_ACEPTAR_MANTENER_INFORMADO),
                Click.on(RegistroUsuarioPage.CHECK_ACEPTAR_DIRECTICES_UTEST),
                Click.on(RegistroUsuarioPage.CHECK_ACEPTAR_POLITICAS_SYP),
                Click.on(RegistroUsuarioPage.BTN_REGISTRO_COMPLETO)

        );
    }
}
