package Model.Support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    private WebDriver driver;

    public Waits(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement visibilityOfElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(300));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement loadElement(WebElement element) {
        try {
            return new WebDriverWait(driver, Duration.ofMillis(300)).until(ExpectedConditions.visibilityOf(element));
        } catch (WebDriverException e) {
            return element;
        }
    }

    public static void esperaEmSegundosSleeper(int timeout){
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(timeout));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //Exemplo de método estático com o Thread.Sleep
    public static void aguardaEmSegundos(int timeout){
        try {
            Thread.sleep(timeout * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}