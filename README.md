# back

Exemplo de aplicação no estilo Spring-Boot.

## Pré requisito
- Maven 3
- Java 8
- Postgresql 10

## Preparando ambiente

- Crie uma base de dados no Postgresql chamada 'back' e rode o script localizado em src/main/resources/ddl.sql.
- Após clonar o projeto, na raiz, execute os comandos
  
```
mvn clean 
mvn install 
mvn spring-boot:run

```

- Para popular alguns dados na tabela, execute a classe de Teste localizada em src/test/java de nome back.BackApplicationTests.java

## Acessando documentação Swagger 

- http://localhost:8080/swagger-ui.html

