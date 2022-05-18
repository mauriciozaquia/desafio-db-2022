import Support.Esperas;
import Support.TestBase;
import Task.TaskFormulario;
import Task.TaskHome;
import Task.TaskIndex;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class UserRegistrationTest extends TestBase {

    private WebDriver driver = getDriver();
    TaskIndex taskIndex = new TaskIndex(driver);
    TaskHome taskHome = new TaskHome(driver);
    TaskFormulario taskFormulario = new TaskFormulario(driver);

    @Test
    public void testarCadastroUsuario(){
        taskIndex.selecionarComecarAutomacaoWeb();
        taskHome.selecionarOpcaoListaFormulario();
        taskHome.selecionarCriarUsuarios();

        taskFormulario.preencherNome("Fulano");
        taskFormulario.preencherUltimoNome("Teste");
        taskFormulario.preencherEmail("teste@teste.com");
        taskFormulario.preencherEndereco("Rua Sem Saida, 123");
        taskFormulario.preencherUniversidade("FDB");
        taskFormulario.preencherProfissao("QA");
        taskFormulario.preencherGenero("Masculino");
        taskFormulario.preencherIdade(27);

        taskFormulario.cadastrarUsuario();
        Esperas.aguardaEmSegundos(30);
    }

}
