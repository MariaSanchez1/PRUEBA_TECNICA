package co.com.angelica.caballero.questions;

import co.com.angelica.caballero.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Text;

public class VerificarRegistroUsuario implements Question {



    public static VerificarRegistroUsuario usuario() {
       return new VerificarRegistroUsuario();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RegistroUsuarioPage.TITULO_BIENVENIDA).answeredBy(actor);
    }
}
