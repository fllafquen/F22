package pruebas;

import org.junit.Assert;
import org.junit.Test;

public class Buy extends BaseTestSuite{


    @Test
    public void lookFor() throws InterruptedException {
        //abrir url
        chromeDriver.get("https://webintqa.sii.cl:1951/AUT2000/InicioAutenticacion/IngresoRutClave.html?https://zeuscertx86.sii.cl:441/dior_cgi/ren_mp/REN_MenusRenta.cgi?opcion=11");

        principalPage.goToSignIn("9492402-2","aa11");
        menuRenta.declarar("2023");
        contribuyentesF22.continuar();
        prestamoContribuynte.continuar();
        boolean check = generarFormulario.validaGeneracionFormulario();

        Assert.assertTrue(check);

        Thread.sleep(3000);

    }
}
