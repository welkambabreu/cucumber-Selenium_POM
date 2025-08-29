package steps;

import java.util.Map;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import core.Driver;
import pages.LoginPage;

public class LoginSteps{

    private LoginPage LoginPage;
    private String usuario;

    @Before
    public void inincializaTeste(){
        Driver.inicializaNavegador();
    }


    @Dado("que esteja na url do process")
    public void queEstejaNaUrlDoProcess() {
        Driver.getDriver().get("inserir a url do sistema a ser testado");
        LoginPage = new LoginPage();
    }

    @Quando("o login for realizado com")
    public void oLoginForRealizadoCom(Map<String, String> map) {
        if (!map.containsKey("usuario") || !map.containsKey("senha")) {
            throw new IllegalArgumentException("Mapa de login não contém as chaves esperadas: 'usuario' e 'senha'");
        }

        String usuarioMap = map.get("usuario");
        String senhaMap = map.get("senha");

        if (usuarioMap == null || senhaMap == null || usuarioMap.isEmpty() || senhaMap.isEmpty()) {
            throw new IllegalArgumentException("Usuário ou senha estão nulos ou vazios.");
        }

        LoginPage.realizarLogin(usuarioMap, senhaMap);
        usuario = usuarioMap;
    }

    @Entao("valido que o login foi realizado")
    public void validoQueOLoginFoiRealizado() {
        String mensagemBoasVindas = LoginPage.getBoasvindas();
        assertEquals("Bem Vindo ao Sistema XXXX", mensagemBoasVindas.trim());
    }

    @After

    public void finalizaTeste(){
        Driver.getDriver().quit();
    }

}

