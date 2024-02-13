package web.mariasanchez.step;

import org.openqa.selenium.WebDriver;
import web.mariasanchez.page.Categoria_SubcategoriaPage;

public class Categoria_SubcategoriaStep {

    private static Categoria_SubcategoriaPage categoriaSubcategoriaPage = new Categoria_SubcategoriaPage();

    WebDriver driver;

    public Categoria_SubcategoriaStep() {
    }

    public void que_ingreso_a_la_pagina_exito(WebDriver driver) {
        System.out.println("aqui");
        categoriaSubcategoriaPage.que_ingreso_a_la_pagina_exito(driver);
    }

    public void visualizo_la_pagina_principal(){
        categoriaSubcategoriaPage.visualizo_la_pagina_principal();
    }

    public void doy_click_a_menu_se_despliega_la_lista_de_categorias() throws InterruptedException {
        categoriaSubcategoriaPage.doy_click_a_menu_se_despliega_la_lista_de_categorias();
    }
    public void selecciono_la_categoria(String categoria) throws InterruptedException{
        categoriaSubcategoriaPage.selecciono_la_categoria(categoria);
    }

    public void selecciono_la_subcategoria(String subcategoria) throws InterruptedException{
        categoriaSubcategoriaPage.selecciono_la_subcategoria(subcategoria);
    }

    public void visualizo_los_productos_existentes() throws InterruptedException {
        categoriaSubcategoriaPage.visualizo_los_productos_existentes();
    }
}
