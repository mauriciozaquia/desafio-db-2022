package Task;

import Pages.PageHome;
import org.openqa.selenium.WebDriver;

public class TaskHome {

    private static WebDriver driver;
    private static PageHome pageHome;

    public TaskHome(WebDriver driver) {
        this.driver = driver;
        pageHome = new PageHome(this.driver);
    }

    public void selecionarOpcaoListaFormulario(){
        pageHome.getListaFormulario().click();
    }

    public void selecionarCriarUsuarios() {
        pageHome.getListaCriarUsuarios().click();
    }
}
