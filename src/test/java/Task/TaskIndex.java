package Task;

import Pages.PaginaIndex;
import org.openqa.selenium.WebDriver;

public class TaskIndex {

    private static WebDriver driver;
    private static PaginaIndex paginaIndex;

    public TaskIndex(WebDriver driver) {
        this.driver = driver;
        paginaIndex = new PaginaIndex(this.driver);
    }

    public void selecionarComecarAutomacaoWeb(){
        paginaIndex.getButtonComecarAutomacao().click();
    }

}
