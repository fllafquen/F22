package pruebas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {
    WebDriver chromeDriver;
    PrincipalPage principalPage;
    MenuRenta menuRenta;
    GenerarFormulario generarFormulario;
    PrestamoContribuynte prestamoContribuynte;
    ContribuyentesF22 contribuyentesF22;

    private void initializePage(WebDriver driver){
        principalPage = new PrincipalPage(driver);
        contribuyentesF22 = new ContribuyentesF22(driver);
        generarFormulario = new GenerarFormulario(driver);
        prestamoContribuynte = new PrestamoContribuynte(driver);
        menuRenta = new MenuRenta(driver);
    }

    @Before
    public void openDriver(){
        //Encontrar archivo driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //crear opciones sobre el driver
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette", false);

        //crear nueva instancia de firefox
        chromeDriver = new ChromeDriver(options);

        //definineido tiempo de espera
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        initializePage(chromeDriver);
    }

    @After
    public void closeTest(){
        chromeDriver.quit();
    }
}
