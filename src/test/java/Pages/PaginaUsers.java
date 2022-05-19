package Pages;

import Support.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class PaginaUsers {

    private WebDriver driver;
    private Esperas wait;

    public PaginaUsers(WebDriver driver) {
        this.driver = driver;
        wait = new Esperas(driver);
    }

    public WebElement getLabelSucesso(){
        WebElement el = driver.findElement(By.cssSelector(".col.s9 .row:nth-child(2)  #notice"));
        return wait.loadElement(el);
    }

}
