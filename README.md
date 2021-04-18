# spring-docker-dev-environment
<p>
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/my-study-area/spring-docker-dev-environment">
    <a href="https://github.com/my-study-area">
        <img alt="Made by" src="https://img.shields.io/badge/made%20by-adriano%20avelino-gree">
    </a>
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/my-study-area/spring-docker-dev-environment">
    <a href="https://github.com/EliasGcf/readme-template/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/my-study-area/spring-docker-dev-environment">
    </a>
</p>
Exemplo de aplicação Spring sendo executada com docker e realizando o Hot Reloading no ambiente de desenvolvimento.

Projeto foi desenvolvido com os conhecimentos adquiridos na aula [Usando Docker para criar um ambiente de desenvolvimento Spring Boot](https://www.youtube.com/watch?v=c-Bq6JUfRnk&ab_channel=AlgaWorks) e  no repositório do Github [ambiente-desenvolvimento-docker-com-spring](https://github.com/Wildrimak/ambiente-desenvolvimento-docker-com-spring).

## Começando
- No terminal execute `git clone https://github.com/my-study-area/spring-docker-dev-environment.git` para baixar o projeto.

- No eclipse clique em `File` > `Open Projects from File System ...` > Na janela que abrir clique em `Directory` para selecionar o projeto, no campo `Import Source`, selecione o projeto e clique em `Finish`.

> Antes de iniciar as configurações no eclipse é necessário [verificar se o pom.xml e o application.properties possuem as configurações corretas](https://github.com/my-study-area/spring-docker-dev-environment/commit/b679087729e310268569cd196d8758db5b0289ae).

- Com o projeto aberto, clique no menu `Run` > `Run Configuration`.
<image src="src/main/resources/static/img/run-runconfiguration.png" alt="Imagem do menu, onde as opções serão clicadas">

- Clique o com o botão direito do mouse em `Java Application`, clique em `New`. 
<image src="src/main/resources/static/img/java-javaapplication.png" alt="Imagem com as opções que serão clicadas">

- Digite um nome no campo `Name`, por exemplo Remote, certifique que está selecionado o projeto `springdockerdevenvironment` em `Project`, no campo `Main Class ` digite `org.springframework.boot.devtools.RemoteSpringApplication`.
<image src="src/main/resources/static/img/java-javaapplication-remote.png" alt="Imagem com os campos preenchidos na aba Main">

- Na aba `Arguments`, no campo `Program arguments` digite `http://localhost:8080` e clique no botão `Apply` e depois em `Run`.
<image src="src/main/resources/static/img/java-javaapplication-arguments.png" alt="Imagem com os campos preenchidos na aba Arguments">

- No terminal execute `./mvnw clean package; docker-compose up --build` para gerar o jar e iniciar a aplicação.

- Agora basta alterar a classe `src/main/java/br/con/adrianoavelino/springdockerdevenvironment/controller/OlaMundoController.java` e visualizar as alterações em [http://localhost:8080/olamundo](http://localhost:8080/olamundo)
.
