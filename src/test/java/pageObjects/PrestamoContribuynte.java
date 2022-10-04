package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestamoContribuynte {

    public PrestamoContribuynte(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\'my-wrapper\']/div[2]/div/div/div/div[3]/div/div/section/div[4]/b-button[2]")
    private WebElement btnContinuar;

    public void continuar(){
        btnContinuar.click();
    }


}
