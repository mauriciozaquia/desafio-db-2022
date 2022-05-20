package Task;

import Pages.PageFormRegistration;
import Model.User;
import org.openqa.selenium.WebDriver;

public class TaskFormRegistration {

    private static WebDriver driver;
    private static PageFormRegistration pageFormRegistration;

    public TaskFormRegistration(WebDriver driver) {
        this.driver = driver;
        pageFormRegistration = new PageFormRegistration(this.driver);
    }

    public void preencherNome(String nome) {
        pageFormRegistration.getInputNome().sendKeys(nome);
    }

    public void preencherUltimoNome(String ultimoNome) {
        pageFormRegistration.getInputUltimoNome().sendKeys(ultimoNome);
    }

    public void preencherEmail(String email) {
        pageFormRegistration.getInputEmail().sendKeys(email);
    }

    public void preencherEndereco(String endereco) {
        pageFormRegistration.getInputEndereco().sendKeys(endereco);
    }

    public void preencherUniversidade(String universidade) {
        pageFormRegistration.getInputUniversidade().sendKeys(universidade);
    }

    public void preencherProfissao(String profissao) {
        pageFormRegistration.getInputProfissao().sendKeys(profissao);
    }

    public void preencherGenero(String genero) {
        pageFormRegistration.getInputGenero().sendKeys(genero);
    }

    public void preencherIdade(int idade) {
        pageFormRegistration.getInputIdade().sendKeys(Integer.toString(idade));
    }

    public void cadastrarUsuario(){
        pageFormRegistration.getBotaoCriar().click();
    }

    public void preencherCampos(User usuario){
        pageFormRegistration.getInputNome().sendKeys(usuario.getNome());
        pageFormRegistration.getInputUltimoNome().sendKeys(usuario.getUltimoNome());
        pageFormRegistration.getInputEmail().sendKeys(usuario.getEmail());
        pageFormRegistration.getInputEndereco().sendKeys(usuario.getEndereco());
        pageFormRegistration.getInputUniversidade().sendKeys(usuario.getUniversidade());
        pageFormRegistration.getInputProfissao().sendKeys(usuario.getProfissao());
        pageFormRegistration.getInputGenero().sendKeys(usuario.getGenero());
        pageFormRegistration.getInputIdade().sendKeys(Integer.toString(usuario.getIdade()));
    }

}
