# Customers

Учебный проект, обкатка работы с OpenApi.

### Technologies
* Java 11
* REST API
* Spring Boot
* Lombok
* SpringDoc & OpenAPI 3.0 & Swagger
* Maven

### Steps
Подготовить спецификацию OpenAPI https://editor-next.swagger.io/

Создать шаблон проекта https://start.spring.io/

Спецификацию разместить в src/main/resources/static

Сгенерировать код по спецификации

```mvn clean install```

Выполнить основную разработку.

Запустить

```mvn spring-boot:run```

Открыть документацию проекта  http://localhost:8080/swagger-ui.html
