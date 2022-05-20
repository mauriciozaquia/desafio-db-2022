package pages;

import utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHome {

    private WebDriver driver;
    private Waits wait;

    public PageHome(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getListaFormulario() {
        WebElement el = driver.findElement(By.cssSelector(".row .col .collapsible li:nth-child(1)"));
        return wait.loadElement(el);
    }

    public WebElement getListaCriarUsuarios() {
        WebElement el = driver.findElement(By.xpath(".//*[@data-method='get']"));
        return wait.loadElement(el);
    }

}
