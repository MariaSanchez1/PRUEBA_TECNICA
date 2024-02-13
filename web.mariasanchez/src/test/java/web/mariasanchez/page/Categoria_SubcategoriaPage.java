package web.mariasanchez.page;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Categoria_SubcategoriaPage {

    public static WebDriver driver;
    WebDriverWait wait;
    String subcategoria;

    public void que_ingreso_a_la_pagina_exito(WebDriver driver) {
        System.out.println("aqui");
        System.out.println(driver);
        this.driver = driver;
    }

    public void visualizo_la_pagina_principal(){
        driver.findElement(By.xpath("//button[@aria-label=\"Collapse menu\"]")).click();
    }

    public void doy_click_a_menu_se_despliega_la_lista_de_categorias() throws InterruptedException {

        try {
            WebElement container = driver.findElement(By.xpath("//aside[@class=\"MegaMenu_data-menu-container__I2l5Q\"]"));
            boolean f = container.isDisplayed();
            Assertions.assertTrue(f, "El elemento no está presente");
        } catch (NoSuchElementException e) {
            mensaje();
        }
        new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep( 1000);
    }

    public void selecciono_la_categoria(String categoria) throws InterruptedException {
        try {
            WebElement cat = driver.findElement(By.xpath("//div/li[.//p[contains(text(),'"+categoria+"')]]"));
            cat.click();
            boolean f = cat.isDisplayed();
            Assertions.assertTrue(f, "El elemento no está presente");
        } catch (NoSuchElementException e) {
            mensaje();
        }
        Thread.sleep( 1000);
    }

    public void selecciono_la_subcategoria(String subcategoria) throws InterruptedException {
        try {
            this.subcategoria=subcategoria;
            WebElement sub = driver.findElement(By.xpath("//a[contains(text(),\""+ subcategoria+"\")]"));
            boolean f = sub.isDisplayed();
            sub.click();
            Assertions.assertTrue(f, "El elemento no está presente");
        } catch (NoSuchElementException e) {
            mensaje();
        }
        Thread.sleep( 1000);
    }

    public void visualizo_los_productos_existentes() throws InterruptedException {
        try {
            WebElement sub = driver.findElement(By.xpath("//h1[contains(text(),'"+this.subcategoria+"')]"));
            sub.click();
            boolean f = sub.isDisplayed();
            Assertions.assertTrue(f, "El elemento no está presente");
        } catch (NoSuchElementException e) {
            System.out.println("No se pudo encontrar el elemento con el XPath proporcionado.");
            Assertions.fail("No se encontró el elemento con el XPath proporcionado.");
        }
        Thread.sleep( 1000);
        driver.quit();
    }

    public void mensaje(){
        System.out.println("No se pudo encontrar el elemento con el XPath proporcionado.");
        Assertions.fail("No se encontró el elemento con el XPath proporcionado.");
    }



}
