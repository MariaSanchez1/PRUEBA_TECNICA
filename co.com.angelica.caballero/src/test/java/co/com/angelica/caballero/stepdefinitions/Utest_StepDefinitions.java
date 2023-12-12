package co.com.angelica.caballero.stepdefinitions;

import co.com.angelica.caballero.tasks.AbrirPagina;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Utest_StepDefinitions {

    @Before
    public void  iniciarTest(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("Angelica ingresa al aplicativo de Utest")
    public void angelicaIngresaAlAplicativoDeUtest() {
        OnStage.theActor("Angelica").wasAbleTo(AbrirPagina.utest());
    }

    @Cuando("inicio en el apartado de join today")
    public void inicioEnElApartadoDeJoinToday() {
    }

    @Y("completa los datos de cuentanos de ti")
    public void completaLosDatosDeCuentanosDeTi() {
    }

    @Y("completa los datos de Direccion")
    public void completaLosDatosDeDireccion() {
    }

    @Y("lleno los datos de mis los dispositivos")
    public void llenoLosDatosDeMisLosDispositivos() {
    }

    @Y("lleno los datos de mi contrasenna")
    public void llenoLosDatosDeMiContrasenna() {
    }

    @Entonces("Verificamos que se haya realizado el registro del usuario")
    public void verificamosQueSeHayaRealizadoElRegistroDelUsuario() {
    }
}
