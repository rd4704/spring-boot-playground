# Spring Boot Playground

This is a sample application with spring boot with simple CRUD operations.

## Structure
The project is divided into the following components:
1. **api**: contains the REST api controller
2. **dao**: Data Access Object Layer, contains interfaces and multiple implementations in form of repositories.
3. **datasource**: postgres datasource implementation using HikariDataSource
4. **model**: Person Model
5. **service**: Service that performs actions on the selected Repository.

## Database
The datasource is configured with Postgres and its dependencies has been added to gradle.build.
The configuration for JDBC and flyway migrations are added to `resources/application.yml`.

To start a postgres db locally using docker:
```
docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres
```

On booting the service flyway migrations will be applied to the postgres database using JDBC connection.

## API path
APIs can be accessed using this base path: `http://localhost:8080/api/v1/person` 