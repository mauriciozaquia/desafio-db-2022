package tasks;

import pages.PageFormRegistration;
import pages.PageUsers;
import model.support.report.Printscreen;
import model.support.report.Report;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationFormRegistration {

    private static WebDriver driver;
    private PageFormRegistration pageFormRegistration;
    private PageUsers pageUsers;

    public ValidationFormRegistration(WebDriver driver) {
        this.driver = driver;
        pageFormRegistration = new PageFormRegistration(this.driver);
        pageUsers = new PageUsers(this.driver);
    }

    public void validarCadastroSucesso() {
        assertAll("Validação de cadastro com sucesso do usuário",
                ()->assertTrue(pageUsers.getLabelSucesso().isDisplayed()),
                ()->assertEquals(pageUsers.getLabelSucesso().getText(), "Usuário Criado com sucesso")
        );
    }

    public void validarCadastroSucessoComRelatorio(){
      try {
            assertAll("Validação de cadastro com sucesso do usuário",
                    ()->assertTrue(pageUsers.getLabelSucesso().isDisplayed()),
                    ()->assertEquals("Usuário Criado com sucesso", pageUsers.getLabelSucesso().getText())
            );
            Report.log(Status.PASS, "Cadastrou com sucesso", Printscreen.fullPageBase64(driver));
        } catch (Error | Exception e){
            Report.log(Status.FAIL, "Não cadastrou com sucesso", Printscreen.fullPageBase64(driver));
        }
    }

    public void validarLabelUniversidade() {
        try {
            assertAll("Validação do label universidade",
                    ()->assertEquals("Universidade", pageUsers.getLabelUniversidade().getText())
            );
            Report.log(Status.PASS, "Label escrito corretamente", Printscreen.fullPageBase64(driver));
        } catch (Error | Exception e){
            Report.log(Status.FAIL, "Label escrito errado", Printscreen.fullPageBase64(driver));
        }
    }
}
