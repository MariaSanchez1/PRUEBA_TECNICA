package co.com.angelica.caballero.utils;

import net.serenitybdd.core.pages.PageObject;

import java.util.Random;

public class ModificarCorreo extends PageObject {

    public static String numAleatorio(String correo){
        Random random=new Random();
        int numero= random.nextInt(1000);
        String email=numero+correo;
        return email;
    }
}
