package tasks;

import pages.PageIndex;
import org.openqa.selenium.WebDriver;

public class TaskIndex {

    private static WebDriver driver;
    private static PageIndex pageIndex;

    public TaskIndex(WebDriver driver) {
        this.driver = driver;
        pageIndex = new PageIndex(this.driver);
    }

    public void selecionarComecarAutomacaoWeb(){
        pageIndex.getButtonComecarAutomacao().click();
    }

}
