import Support.Esperas;
import Support.Report.CapturaDeTela;
import Support.Report.Relatorio;
import Support.Report.TipoRelatorio;
import Support.TestBase;
import Task.TaskFormulario;
import Task.TaskHome;
import Task.TaskIndex;
import Task.ValidacaoFormulario;
import Test.Modelo.Usuario;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class UserRegistrationTest extends TestBase {

    private WebDriver driver = getDriver();
    TaskIndex taskIndex = new TaskIndex(driver);
    TaskHome taskHome = new TaskHome(driver);
    TaskFormulario taskFormulario = new TaskFormulario(driver);
    ValidacaoFormulario validacaoFormulario = new ValidacaoFormulario(driver);

    @BeforeEach
    public void configura(){
        Relatorio.criaTeste("Realizar Compra com Sucesso Parametrizado", TipoRelatorio.SINGLE);
    }

    @Test
    public void testarCadastroUsuario() {
        try {
            Usuario usuario = new Usuario();
            usuario.setNome("Fulano");
            usuario.setUltimoNome("Teste");
            usuario.setEmail("teste@teste.com");
            usuario.setEndereco("Rua Sem Saida, 123");
            usuario.setUniversidade("FDB");
            usuario.setProfissao("QA");
            usuario.setGenero("Masculino");
            usuario.setIdade(27);

            taskIndex.selecionarComecarAutomacaoWeb();
            taskHome.selecionarOpcaoListaFormulario();
            taskHome.selecionarCriarUsuarios();
            taskFormulario.preencherCampos(usuario);
            taskFormulario.cadastrarUsuario();
            validacaoFormulario.validarCadastroSucesso();
            validacaoFormulario.validarCadastroSucessoComRelatorio();

        } catch (Exception e) {
            Relatorio.log(Status.ERROR, e.getMessage(), CapturaDeTela.fullPageBase64(driver));
        }

    }

}
