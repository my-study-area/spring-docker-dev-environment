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

- Com o projeto aberto clique no menu `Run` > `Run Configuration` > `Java Application`, clique em `New Configuration`. Digite um nome no campo `Name`, por exemplo Remote, certifique que está selecionado o projeto `springdockerdevenvironment` em `Projects`, no campo `Main Class ` digite `org.springframework.boot.devtools.RemoteSpringApplication`. Na aba `Arguments`, no campo `Program arguments` digite `http://localhost:8080` e clique no botão `Apply` e depois em `Run`.

- No terminal, dentro do projeto, execute `./mvnw clean package` para gerar o arquivo `.jar` na pasta target.

- Ainda no terminal execute `docker build -t spring-app .` para gerar a imagem docker. E execute `docker run -p 8080:8080 spring-app` para iniciar a aplicação. Para acessar a api acesse [http://localhost:8080/olamundo](http://localhost:8080/olamundo)

- Agora basta alterar a classe `src/main/java/br/con/adrianoavelino/springdockerdevenvironment/controller/OlaMundoController.java`e atualizar o navegador para visualizar as alterações.
