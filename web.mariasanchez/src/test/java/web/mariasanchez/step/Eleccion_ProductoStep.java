package web.mariasanchez.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.mariasanchez.page.Eleccion_ProductoPage;

public class Eleccion_ProductoStep {

    private Eleccion_ProductoPage eleccionProductoPage = new Eleccion_ProductoPage();

    public void seleccionoProductosAleatoriamente(Integer cantidad) throws InterruptedException {
        eleccionProductoPage.seleccionoProductosAleatoriamente(cantidad);
    }

    public void seleccionolaciudadyalmacen(String ciudad, String almacen) throws InterruptedException {
        eleccionProductoPage.seleccionolaciudadyalmacen(ciudad,almacen);
    }

    public void visualizoQueLosProductosSeanLosCorrectos() {
        eleccionProductoPage.visualizoQueLosProductosSeanLosCorrectos();
    }



}
