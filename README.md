# Workshop MongoDB — Projeto de Estudos

Projeto de estudos voltado à **introdução ao MongoDB e à sua integração com o Spring Boot**. A aplicação consiste em uma API REST de usuários, publicações e comentários, desenvolvida para praticar os conceitos básicos de persistência em um banco NoSQL.

## Objetivos de aprendizado

- Entender a organização dos dados em documentos e coleções.
- Realizar operações de CRUD com Spring Data MongoDB.
- Explorar referências com `@DBRef` e documentos embutidos.
- Utilizar DTOs para transferência de dados.
- Criar consultas por texto e intervalo de datas.
- Organizar uma API REST em camadas.

## Tecnologias

- Java 25
- Spring Boot 4.1.1 e Spring Web MVC
- Spring Data MongoDB
- MongoDB
- Maven

## Funcionalidades

- Cadastro, consulta, atualização e exclusão de usuários.
- Listagem dos posts de um usuário.
- Consulta de posts por ID.
- Pesquisa por título, ignorando maiúsculas e minúsculas.
- Pesquisa em título, conteúdo e comentários, com filtro por data.
- Tratamento de recursos não encontrados.

## Como executar

**Pré-requisitos:** Java 25, Git e MongoDB em execução.

```bash
git clone https://github.com/pedrohsantosdev/whorkshop-mongodb.git
cd whorkshop-mongodb
```

Configure a conexão em `src/main/resources/application.properties`:

```properties
spring.application.name=whorkshopmongo
spring.mongodb.uri=mongodb://localhost:27017/whorkshop_mongo
```

Execute no Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Ou no Linux/macOS:

```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

> **Dados para estudo:** a cada inicialização, a classe `Instatiation` apaga os usuários e posts existentes e recria os dados de exemplo. Utilize um banco dedicado ao projeto.

## Endpoints

| Método | Rota | Descrição |
| --- | --- | --- |
| GET | `/users` | Lista usuários |
| GET | `/users/{id}` | Consulta um usuário |
| POST | `/users` | Cadastra um usuário |
| PUT | `/users/{id}` | Atualiza um usuário |
| DELETE | `/users/{id}` | Exclui um usuário |
| GET | `/users/{id}/posts` | Lista os posts de um usuário |
| GET | `/posts/{id}` | Consulta um post |
| GET | `/posts/titlesearch?text=viagem` | Pesquisa por título |
| GET | `/posts/fullsearch?text=viagem&minDate=2018-03-01&maxDate=2018-03-31` | Pesquisa em título, conteúdo ou comentários, filtrando pela data do post |

### Cadastro de usuário

Envie `POST /users` com `Content-Type: application/json`:

```json
{
  "name": "Ana Silva",
  "email": "ana@example.com"
}
```

## Organização

- `domain`: documentos do MongoDB.
- `dto`: objetos de transferência de dados.
- `repositories`: persistência e consultas.
- `services`: operações da aplicação.
- `resources`: endpoints e tratamento de erros.
- `config`: carga inicial de dados.

## Autor

https://github.com/pedrohsantosdev
