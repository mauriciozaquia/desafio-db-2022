package Pages;

import Support.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaIndex {

    private WebDriver driver;
    private Esperas wait;

    public PaginaIndex(WebDriver driver) {
        this.driver = driver;
        wait = new Esperas(driver);
    }

    public WebElement getButtonComecarAutomacao() {
        WebElement el = driver.findElement(By.cssSelector(".row.center:nth-child(3) a"));
        return wait.loadElement(el);
    }

}
