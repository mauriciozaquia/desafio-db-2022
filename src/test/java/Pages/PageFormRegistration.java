package Pages;

import Model.Support.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageFormRegistration {

    private WebDriver driver;
    private Waits wait;

    public PageFormRegistration(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getInputNome() {
        WebElement el = driver.findElement(By.cssSelector("#user_name"));
        return wait.loadElement(el);
    }

    public WebElement getInputUltimoNome() {
        WebElement el = driver.findElement(By.cssSelector("#user_lastname"));
        return wait.loadElement(el);
    }

    public WebElement getInputEmail() {
        WebElement el = driver.findElement(By.cssSelector("#user_email"));
        return wait.loadElement(el);
    }

    public WebElement getInputEndereco() {
        WebElement el = driver.findElement(By.cssSelector("#user_address"));
        return wait.loadElement(el);
    }

    public WebElement getInputUniversidade() {
        WebElement el = driver.findElement(By.cssSelector("#user_university"));
        return wait.loadElement(el);
    }

    public WebElement getInputProfissao() {
        WebElement el = driver.findElement(By.cssSelector("#user_profile"));
        return wait.loadElement(el);
    }

    public WebElement getInputGenero() {
        WebElement el = driver.findElement(By.cssSelector("#user_gender"));
        return wait.loadElement(el);
    }

    public WebElement getInputIdade() {
        WebElement el = driver.findElement(By.cssSelector("#user_age"));
        return wait.loadElement(el);
    }

    public WebElement getBotaoCriar(){
        WebElement el = driver.findElement(By.cssSelector(".new_user input[type=submit]"));
        return wait.loadElement(el);
    }

    //TODO pegar o locator do botao voltar
    //public WebElement getBotaoVoltar(){
        //WebElement el = driver.findElement(By.cssSelector(".new_user input[type=submit]"));
        //return wait.loadElement(el);
    //}
}
