package web.mariasanchez.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.mariasanchez.base.base;
import web.mariasanchez.step.Categoria_SubcategoriaStep;


public class Categoria_SubcategoriaStepDefinition {

    public base base = new base();
    public static Categoria_SubcategoriaStep categoriaSubcategoriaStep=new Categoria_SubcategoriaStep();

    @Given("que ingreso a la pagina Exito")
    public void que_ingreso_a_la_pagina_exito() {
        base.get("https://www.exito.com/");

        categoriaSubcategoriaStep.que_ingreso_a_la_pagina_exito(base.driver());
    }
    @Given("visualizo la pagina principal")
    public void visualizo_la_pagina_principal() {
        categoriaSubcategoriaStep.visualizo_la_pagina_principal();
    }
    @When("doy click a Menu se despliega la lista de categorias")
    public void doy_click_a_menu_se_despliega_la_lista_de_categorias() throws InterruptedException {
        categoriaSubcategoriaStep.doy_click_a_menu_se_despliega_la_lista_de_categorias();
    }
    @When("selecciono la categoria {string}")
    public void selecciono_la_categoria(String categoria) throws InterruptedException {
        categoriaSubcategoriaStep.selecciono_la_categoria(categoria);
    }
    @When("selecciono la subcategoria {string}")
    public void selecciono_la_subcategoria(String subcategoria) throws InterruptedException {
        categoriaSubcategoriaStep.selecciono_la_subcategoria(subcategoria);
    }
    @Then("visualizo los productos existentes")
    public void visualizo_los_productos_existentes() throws InterruptedException {
        categoriaSubcategoriaStep.visualizo_los_productos_existentes();
    }
}
