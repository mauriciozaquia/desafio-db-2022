# Desafio DBServer - Prova para alinhamento de conhecimentos em automação de testes
## Testes automatizados web

Estes *Script* foi desenvolvido para o desafio de testes automatizados do alinhamento de conhecimentos **DBserver**, tem por objetivo testar e validar casos de uso para o site [**automacaocombatista**](https://automacaocombatista.herokuapp.com/home/index)

### PRÉ REQUISITOS

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas ou dependências:

* [Git](https://git-scm.com)
* [Java](https://www.java.com/pt-BR/)
* [JDK](https://www.oracle.com/java/technologies/downloads/)
* [JUnit 5](https://junit.org/junit5/)
* [Maven](https://maven.apache.org/)

Além disto é bom ter uma IDE Java para trabalhar com o código como por exemplo o [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/) ou [Ecplipse](https://www.eclipse.org/downloads/) dentre outras.

### EXECUÇÃO

* Abra o projeto "desafio-db-2022"
* Navegar até o pacote src/test/java/Test/
* Na classe *UserRegistrationTest* clicar com o botão direito
* Clicar no menu "Run UserRegistrationTest

### CENÁRIOS DE TESTE

#### Cenário 1: Realizar cadastro de usuário
* Passo 1: Acessar o site https://automacaocombatista.herokuapp.com/home/index
* Passo 2: Acessar “Começar Automação Web”
* Passo 3: Preencher Formulário para cadastrar novo usuário
* Passo 4: Validar mensagem de criação de usuário

### CENÁRIOS EXTRAS

#### Cenário Extra 1: Validar label universidade no formulário de cadastro (Exemplo de teste que falha)
* Passo 1: Acessar o site https://automacaocombatista.herokuapp.com/home/index
* Passo 2: Acessar “Começar Automação Web”
* Passo 3: Preencher Formulário para cadastrar novo usuário
* Passo 4: Validar label