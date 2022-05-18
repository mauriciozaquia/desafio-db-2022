package Task;

import Pages.PaginaFormulario;
import Pages.PaginaHome;
import org.openqa.selenium.WebDriver;

public class TaskFormulario {

    private static WebDriver driver;
    private static PaginaFormulario paginaFormulario;

    public TaskFormulario(WebDriver driver) {
        this.driver = driver;
        paginaFormulario = new PaginaFormulario(this.driver);
    }

    public void preencherNome(String nome) {
        paginaFormulario.getInputNome().sendKeys(nome);
    }

    public void preencherUltimoNome(String ultimoNome) {
        paginaFormulario.getInputUltimoNome().sendKeys(ultimoNome);
    }

    public void preencherEmail(String email) {
        paginaFormulario.getInputEmail().sendKeys(email);
    }

    public void preencherEndereco(String endereco) {
        paginaFormulario.getInputEndereco().sendKeys(endereco);
    }

    public void preencherUniversidade(String universidade) {
        paginaFormulario.getInputUniversidade().sendKeys(universidade);
    }

    public void preencherProfissao(String profissao) {
        paginaFormulario.getInputProfissao().sendKeys(profissao);
    }

    public void preencherGenero(String genero) {
        paginaFormulario.getInputGenero().sendKeys(genero);
    }

    public void preencherIdade(int idade) {
        paginaFormulario.getInputIdade().sendKeys(Integer.toString(idade));
    }

    public void cadastrarUsuario(){
        paginaFormulario.getBotaoCriar().click();
    }

}