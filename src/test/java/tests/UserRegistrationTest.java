package tests;

import model.support.report.Printscreen;
import model.support.report.Report;
import model.support.report.ReportType;
import model.support.TestBase;
import tasks.TaskFormRegistration;
import tasks.TaskHome;
import tasks.TaskIndex;
import tasks.ValidationFormRegistration;
import model.User;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class UserRegistrationTest extends TestBase {

    private WebDriver driver = getDriver();
    TaskIndex taskIndex = new TaskIndex(driver);
    TaskHome taskHome = new TaskHome(driver);
    TaskFormRegistration taskFormRegistration = new TaskFormRegistration(driver);
    ValidationFormRegistration validationFormRegistration = new ValidationFormRegistration(driver);

    @BeforeEach
    public void configura(){
        Report.criaTeste("Realizar Compra com Sucesso Parametrizado", ReportType.SINGLE);
    }

    /**
     * Teste para validar sucesso de cadastro de usuário
     */
    @Test
    public void testarCadastroUsuario() {
        try {
            User user = new User();
            user.setNome("Fulano");
            user.setUltimoNome("Teste");
            user.setEmail("teste@teste.com");
            user.setEndereco("Rua Sem Saida, 123");
            user.setUniversidade("FDB");
            user.setProfissao("QA");
            user.setGenero("Masculino");
            user.setIdade(27);

            taskIndex.selecionarComecarAutomacaoWeb();
            taskHome.selecionarOpcaoListaFormulario();
            taskHome.selecionarCriarUsuarios();
            taskFormRegistration.preencherCampos(user);
            taskFormRegistration.cadastrarUsuario();
            validationFormRegistration.validarCadastroSucesso();
            validationFormRegistration.validarCadastroSucessoComRelatorio();

        } catch (Exception e) {
            Report.log(Status.ERROR, e.getMessage(), Printscreen.fullPageBase64(driver));
        }

    }

    /**
     * Teste para validar descrição label - Exemplo de teste com falha
     */
    @Test
    public void testarLabelUniversidade() {
        try {
            User user = new User();
            user.setNome("Fulano");
            user.setUltimoNome("Teste");
            user.setEmail("teste@teste.com");
            user.setEndereco("Rua Sem Saida, 123");
            user.setUniversidade("FDB");
            user.setProfissao("QA");
            user.setGenero("Masculino");
            user.setIdade(27);

            taskIndex.selecionarComecarAutomacaoWeb();
            taskHome.selecionarOpcaoListaFormulario();
            taskHome.selecionarCriarUsuarios();
            taskFormRegistration.preencherCampos(user);
            taskFormRegistration.cadastrarUsuario();
            validationFormRegistration.validarLabelUniversidade();

        } catch (Exception e) {
            Report.log(Status.ERROR, e.getMessage(), Printscreen.fullPageBase64(driver));
        }

    }

}
