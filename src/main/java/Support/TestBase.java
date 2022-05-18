package Support;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase extends DriverManager {

    private static WebDriver driver;

    private String URL = "https://automacaocombatista.herokuapp.com/home/index";

    public static WebDriver getDriver() {
        driver = getDriver(DriverType.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp() {
        getDriver().get(URL);
    }

    @AfterEach
    public void closeDriver() {
        quitDriver();
        //Relatorio.fecha();
    }

}
