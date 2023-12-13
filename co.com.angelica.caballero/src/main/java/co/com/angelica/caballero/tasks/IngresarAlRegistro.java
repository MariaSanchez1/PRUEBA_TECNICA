package co.com.angelica.caballero.tasks;


import co.com.angelica.caballero.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarAlRegistro implements Task {

    public static IngresarAlRegistro registroToday() {
        return Tasks.instrumented(IngresarAlRegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroUsuarioPage.BTN_JOIN_TODAY)
        );
    }
}
