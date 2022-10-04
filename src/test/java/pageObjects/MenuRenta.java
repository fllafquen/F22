package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuRenta {
    public MenuRenta(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\'my-wrapper\']/div[2]/form/div[2]/center/table/tbody/tr/td[2]/font/select")
    private WebElement formulaio;

    @FindBy(xpath = "//*[@id=\"my-wrapper\"]/div[2]/form/div[2]/center/table/tbody/tr/td[3]/input[1]")
    private WebElement aceptar;

    public void declarar(String year){
        formulaio.sendKeys(year);
        aceptar.click();
    }


}
