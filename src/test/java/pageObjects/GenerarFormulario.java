package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerarFormulario {

    public GenerarFormulario(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//*[@id=\"contenedor\"]/table[3]/tbody/tr/td/table/tbody/tr/td/input")
        private WebElement enviarDeclaracion;

        public boolean validaGeneracionFormulario(){
           return enviarDeclaracion.isDisplayed();
        }

}
