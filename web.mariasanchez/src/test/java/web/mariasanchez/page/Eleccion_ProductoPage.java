package web.mariasanchez.page;

import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;

public class Eleccion_ProductoPage {

    WebDriver driver;
    Random random = new Random();
    public static String  ciudad,almacen;
    int cantidad;

    public void seleccionolaciudadyalmacen(String ciudad, String almacen) throws InterruptedException {
        this.ciudad=ciudad;
        this.almacen=almacen;

    }

    public void seleccionoProductosAleatoriamente(Integer cantidad) throws InterruptedException {
        this.driver=Categoria_SubcategoriaPage.driver;
        Thread.sleep(2000);
        int i=1;
        this.cantidad=cantidad;

        while (i<=cantidad){

            Thread.sleep(2000);
            int p = driver.findElements(By.xpath("//ul[@class=\"Pagination_containerLinkPaginationList__fD44w\"]/li")).size();
            int p1 = random.nextInt(p) + 1;
            if (p1 != 1) {
                WebElement btnpagina = driver.findElement(By.xpath("//ul[@class=\"Pagination_containerLinkPaginationList__fD44w\"]/li[" + p1 + "]//button"));
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", btnpagina);
            }
            Thread.sleep(2000);
            List<WebElement> elementos = driver.findElements(By.xpath("//ul[@data-fs-product-grid-type]/li"));
            int c = elementos.size();

            boolean a=true;
            while(a){
                int c1 = random.nextInt(c) + 1;

                try{
                    driver.findElement(By.xpath("//ul[@data-fs-product-grid=\"true\"]/li["+c1+"]//div[@class=\"QuantitySelectorDefault_defaultStyles__b4Srq  \"]"));
                }catch(Exception e){
                    Thread.sleep(3000);
                    WebElement btnproducto = driver.findElement(By.xpath("//ul[@data-fs-product-grid=\"true\"]/li[" + c1 + "]//button[@class=\"DefaultStyle_default__vCozi \"]"));
                    Thread.sleep(3000);
                    JavascriptExecutor executor = (JavascriptExecutor)driver;
                    executor.executeScript("arguments[0].click();", btnproducto);
                    Thread.sleep(2000);
                    a=false;
                }
            }

            try {
                driver.findElement(By.xpath("//div[@data-testid=\"store-modal\"]")).isDisplayed();
                Thread.sleep(2000);
                WebElement lstciudad =driver.findElement(By.xpath("//input[@id=\"react-select-2-input\"]"));
                lstciudad.sendKeys(ciudad);
                lstciudad.sendKeys(Keys.ENTER);
                Thread.sleep(3000);
                WebElement lstalmacen =driver.findElement(By.xpath("//input[@id=\"react-select-3-input\"]"));
                lstalmacen.sendKeys(almacen);
                lstalmacen.sendKeys(Keys.ENTER);
                WebElement btnconfirmar =driver.findElement(By.xpath("//button[contains(text(),\"Confirmar\")]"));
                btnconfirmar.click();
                WebElement btncerrar = driver.findElement(By.xpath("//div[@role=\"dialog\"]//header/button"));
                btncerrar.click();
            } catch (Exception e) {
                System.out.println("No se abrio el modal");
                i=i+1;
            }
            Thread.sleep(2000);
        }
    }

    public void visualizoQueLosProductosSeanLosCorrectos() {
        WebElement spannumber = driver.findElement(By.xpath("//div[@data-fs-cart-quantity=\"true\"]/span"));
        int cantidad = Integer.parseInt(spannumber.getText()) +1; //genera un error porque si son iguales
        Assert.assertEquals("La cantidad de productos no es la misma",this.cantidad, cantidad);
    }

}
