package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMaps {

    @FindBy(id = "login")
    protected WebElement inpLogin;

    @FindBy(id = "senha")
    protected WebElement inpSenha;

    @FindBy(id = "btn_logar")
    protected WebElement btnLogar;

    @FindBy (xpath = "//strong[contains(text(),'Bem Vindo ao Sistema')]")
    protected WebElement msnBoasVindas;
}