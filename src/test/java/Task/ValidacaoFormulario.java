package Task;

import Pages.PaginaFormulario;
import Pages.PaginaUsers;
import Support.Report.CapturaDeTela;
import Support.Report.Relatorio;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ValidacaoFormulario {

    private static WebDriver driver;
    private PaginaFormulario paginaFormulario;
    private PaginaUsers paginaUsers;

    public ValidacaoFormulario(WebDriver driver) {
        this.driver = driver;
        paginaFormulario = new PaginaFormulario(this.driver);
        paginaUsers = new PaginaUsers(this.driver);
    }

    public void validarCadastroSucesso() {
        assertAll("Validação de cadastro com sucesso do usuário",
                ()->assertTrue(paginaUsers.getLabelSucesso().isDisplayed()),
                ()->assertEquals(paginaUsers.getLabelSucesso().getText(), "Usuário Criado com sucesso")
        );
    }

    public void validarCadastroSucessoComRelatorio(){
      try {
            assertAll("Validação de cadastro com sucesso do usuário",
                    ()->assertTrue(paginaUsers.getLabelSucesso().isDisplayed()),
                    ()->assertEquals(paginaUsers.getLabelSucesso().getText(), "Usuário Criado com sucesso")
            );
            Relatorio.log(Status.PASS, "Cadastrou com sucesso", CapturaDeTela.fullPageBase64(driver));
        } catch (Error | Exception e){
            Relatorio.log(Status.FAIL, "Não cadastrou com sucesso", CapturaDeTela.fullPageBase64(driver));
        }
    }

}
