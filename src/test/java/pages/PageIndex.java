package pages;

import utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageIndex {

    private WebDriver driver;
    private Waits wait;

    public PageIndex(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getButtonComecarAutomacao() {
        WebElement el = driver.findElement(By.cssSelector(".row.center:nth-child(3) a"));
        return wait.loadElement(el);
    }

}
