package pages;

import utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUsers {

    private WebDriver driver;
    private Waits wait;

    public PageUsers(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getLabelSucesso(){
        WebElement el = driver.findElement(By.cssSelector(".col.s9 .row:nth-child(2)  #notice"));
        return wait.loadElement(el);
    }

    public WebElement getLabelUniversidade(){
        WebElement el = driver.findElement(By.cssSelector(".col.s9 .row:nth-child(3) .s12 p:nth-child(4) strong"));
        return wait.loadElement(el);
    }

}
