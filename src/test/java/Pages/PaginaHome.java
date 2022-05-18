package Pages;

import Support.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaHome {

    private WebDriver driver;
    private Esperas wait;

    public PaginaHome(WebDriver driver) {
        this.driver = driver;
        wait = new Esperas(driver);
    }

    public WebElement getListaFormulario() {
        WebElement el = driver.findElement(By.cssSelector(".row .col .collapsible li:nth-child(1)"));
        return wait.loadElement(el);
    }

    public WebElement getListaCriarUsuarios() {
        WebElement el = driver.findElement(By.xpath(".//*[@data-method='get']"));
        //wait.visibilityOfElement(By.cssSelector(".row .col .collapsible li:nth-child(1) .collapsible-body li:nth-child(1) a"));
        return wait.loadElement(el);
    }

}
