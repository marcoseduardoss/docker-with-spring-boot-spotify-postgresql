# docker-with-spring-boot-postgresql

## Pré requisito
- Maven 3
- Java 8
- Docker 1.13.0+
- Spotify

# Build do projeto e criação de sua imagem Docker com Spotify   


```
mvn clean package dockerfile:build 
```

## Executando com Docker Compose 
O Docker-compose executa o projeto, cria e sobe as instâncias a partir da imagem do Postgres e do Projeto Web (criado com o comando mvn). Caso queira, você poderá subir as imagens executando o Comando RUN, mas considero mais prático o uso do Docker-compose.
```
docker-compose up
```

## Exibindo insâncias em execução
Para ver o status das instâncias, execute o comando: Docker ps -a
```
CONTAINER ID        IMAGE                                 COMMAND                  CREATED             STATUS              PORTS                    NAMES
3b7f0cfeceaf        emmanuelneri/spring-boot-docker-app   "java -Djava.securit…"   8 minutes ago       Up 7 seconds        0.0.0.0:8080->8080/tcp   springbootdocker_docker-app_1
7f01ce21cb11        postgres:10.4                         "docker-entrypoint.s…"   8 minutes ago       Up 7 seconds        5432/tcp                 springbootdocker_docker-postgres_1
```

## Acessando 

- http://localhost:8080/db/pool/name
- http://localhost:8080/db/pool/size

## Fonte: 
[Executando aplicações Spring Boot no Docker](https://wp.me/p5RSbg-fO)
