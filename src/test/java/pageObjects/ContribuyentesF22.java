package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContribuyentesF22 {

    public ContribuyentesF22(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cancelar")
    private WebElement recordarMasTarde;

    @FindBy(id = "continuar_infopers")
    private WebElement continuar;


    public void continuar(){
        recordarMasTarde.click();
        continuar.click();
    }
}
