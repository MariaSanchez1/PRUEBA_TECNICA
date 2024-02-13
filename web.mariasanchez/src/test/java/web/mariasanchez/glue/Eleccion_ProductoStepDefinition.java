package web.mariasanchez.glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.mariasanchez.base.base;
import web.mariasanchez.step.Eleccion_ProductoStep;

public class Eleccion_ProductoStepDefinition {

    private Eleccion_ProductoStep eleccionProductoStep = new Eleccion_ProductoStep();


    @Then("selecciono {int} productos aleatoriamente")
    public void seleccionoProductosAleatoriamente(Integer cantidad) throws InterruptedException {
        eleccionProductoStep.seleccionoProductosAleatoriamente(cantidad);
        //eleccionProductoStep.seleccionoProductosAleatoriamente(cantidad,base.driver());
    }

    @And("selecciono la ciudad {string} y el almacen {string}")
    public void seleccionoLaCiudadYElAlmacen(String ciudad, String almacen) throws InterruptedException {
        eleccionProductoStep.seleccionolaciudadyalmacen(ciudad,almacen);
    }

    @Then("visualizo que los productos sean los correctos")
    public void visualizoQueLosProductosSeanLosCorrectos() {
        eleccionProductoStep.visualizoQueLosProductosSeanLosCorrectos();
    }
}

