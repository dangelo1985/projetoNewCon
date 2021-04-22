<!--
*** Obrigado por estar vendo o nosso README. Se você tiver alguma sugestão
*** Agora vamos rodar esse projeto incrível :D
-->


<!-- PROJECT LOGO -->
<br />
  <h1 align="center">Sistema de Pontos Turisticos</h1>
</p>

<!-- ABOUT THE PROJECT -->

## Sobre o Projeto

Este projeto visa o cadastro e listagem de pontos turísticos do país

## Começando

### Instalação

Para instalar deve:
- ter o Spring Tool Suite 4 instalado no computado;
- Ter o Mysql na Versão 8.0.23;
- Ter o NodeJS;
- Ter o VisualStudio;

Instalação
 - Criar um banco de dados no Mysql com o nome "turismo" = 'CREATE DATABASE turismo';
 - Importar o projeto no Spring Tool Suite na aba File no campo = 'Open Projects From File System'
 - Modificar a senha do MYSQL application.properties no Spring dentro do diretorio src/main/resources

 - spring.datasource.username = root -> so muda se o seu MYSQl tem um usuario com outro nome
 - spring.datasource.password = root -> Aqui é a senha que foi cadastrado no MYSql
 - Salva
 Criação das Tabelas: 
 - com o botão direito clica em TurismoApplication no diretorio src/main/java dentro do pacote com.example.turirmo e seleciona a opcão "Run As" depois em Spring Boot App
Pronto seu projeto esta rodando e posso ser consultado no navegador no endereço "http://localhost:8080/api/v1/pontos".

Execução da View:
 - Abre o Visual Studio
 - Entre na aba file -> Open Folder, seleciona a pasta do projeto "react-view" no seu computador;
 - entre na aba termina -> new terminal e execute os comandos:

	cd react-front-end
	npm start

agora entre no navegador e digite o endereço: localhost:3000/
pronto o sistema será executado

### Linguagens Suportadas
- Java JDK 16
- JavaScript (.js)
- JavaScript React (.jsx)
- TypeScript React (.tsx)
- MySQL 8.0.23
- BootStrap 4
- Axios


### Snippets

### Snippets

Abaixo segue a lista com todos os Snippets disponíveis e os gatilhos para cada um. O **⇥** significa a tecla `TAB`.




                  `rfc →` | Cria um Componente **Functional**                                
      `styled-react →` | Cria um arquivo de Estilização com **Styled Components**         


<!-- LICENSE -->

## Licença

Distribuído sob por Rafael.

<!-- CONTACT -->

## Contato

Rafael Moraes D'Angelo - [Github](https://github.com/dangelo1985) - **rafael.dangelo@outlook.com**