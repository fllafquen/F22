package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    public PrincipalPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "rutcntr")
    private WebElement ingresoRut;

    @FindBy(id = "clave")
    private WebElement ingresoClave;

    @FindBy(id = "bt_ingresar")
    private WebElement btnSignIn;

    public void goToSignIn(String rut, String pass){
        ingresoRut.sendKeys(rut);
        ingresoClave.sendKeys(pass);
        btnSignIn.click();
    }


}
