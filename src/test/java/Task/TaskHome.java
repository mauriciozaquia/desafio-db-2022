package Task;

import Pages.PaginaHome;
import org.openqa.selenium.WebDriver;

public class TaskHome {

    private static WebDriver driver;
    private static PaginaHome paginaHome;

    public TaskHome(WebDriver driver) {
        this.driver = driver;
        paginaHome = new PaginaHome(this.driver);
    }

    public void selecionarOpcaoListaFormulario(){
        paginaHome.getListaFormulario().click();
    }

    public void selecionarCriarUsuarios() {
        paginaHome.getListaCriarUsuarios().click();
    }
}
