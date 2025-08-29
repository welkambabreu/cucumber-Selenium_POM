package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    // ThreadLocal para garantir isolamento entre threads
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void inicializaNavegador() {
        String caminhoDriver = "src/test/java/core/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", caminhoDriver);

        // Cria uma instância de navegador por thread
        driver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
    }

    public static void fecharNavegador() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove(); // Remove a instância da thread atual
        }
    }
}