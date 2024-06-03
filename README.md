# Fake Store API - OpenFeign

Este é um projeto Java que implementa uma API de carrinho de compras usando Spring Boot e Feign Client para consumir uma API externa.

## Como baixar e iniciar a aplicação

Primeiro, crie uma pasta:

```
mkdir nome_da_pasta
```

Logo em seguida, clone o repositório para o seu ambiente local:

```sh
git clone https://github.com/sergiocerq/OpenFeign-FakeStore.git
```
Após isso, entre na pasta do repositório

```sh
cd OpenFeign-FakeStore/open-feign
```

Certifique que o Maven está instalado em seu desktop

```
mvn -v
```

Caso não tenha o maven, instale-o utilizando o seguinte comando:

```
sudo apt install maven
```

Compile o projeto:

```
mvn clean install
```

Após a compilação, incie a aplicação

```
java -jar target/open-feign-0.0.1-SNAPSHOT.jar
```

Pronto! Agora clique o endereço http://localhost:8080/swagger-ui/index.html e a aplicação já pode ser testada!
![Screenshot from 2024-06-02 20-54-19](https://github.com/sergiocerq/OpenFeign-FakeStore/assets/126781655/3eb4019a-ad6b-4a0c-80fd-59a4d3b1b53b)
