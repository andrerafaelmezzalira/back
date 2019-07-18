# back

Exemplo de aplicação no estilo Spring-Boot.

## Pré requisito
- Maven 3
- Java 8
- Postgresql 10

## Preparando ambiente

- Crie uma base de dados chamada 'back' e rode o script localizado em src/main/resources/ddl.sql.
  
```
#apos baixar o projeto, na raiz do projeto execute os comandos
mvn clean 
mvn install 

```

- Para popular alguns dados, execute a classe de Teste localizado em src/test/java de nome back.BackApplicationTests.java

- Para subir a aplicação, basta rodar a classe principal back.BackApplication.java
 
## Acessando 

# Documentação Swagger
- http://localhost:8080/swagger-ui.html

