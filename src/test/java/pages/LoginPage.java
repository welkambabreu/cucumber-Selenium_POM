package pages;

import core.Driver;
import maps.LoginMaps;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class LoginPage extends LoginMaps {

    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void realizarLogin(String usuario, String senha){
        if (usuario == null || senha == null || usuario.isEmpty() || senha.isEmpty()) {
            throw new IllegalArgumentException("Login ou senha não podem ser nulos ou vazios.");
        }
        inpLogin.sendKeys(usuario);
        inpSenha.sendKeys(senha);
        btnLogar.click();
    }

    public String getBoasvindas() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(msnBoasVindas));
        return msnBoasVindas.getText();
    }

}
