![Código Certo Coders](https://utfs.io/f/3b2340e8-5523-4aca-a549-0688fd07450e-j4edu.jfif)

# 📚 Trilha Inicial BackEnd Jr Codigo Certo
Este projeto tem como objetivo desenvolver uma API RESTful para gerenciamento de tarefas, proporcionando funcionalidades de CRUD (Create, Read, Update, Delete) de tarefas, autenticação de usuários e armazenamento dos dados em um banco de dados.

Link de acesso da API rodando na AWS:

http://ec2-18-188-193-224.us-east-2.compute.amazonaws.com:8080/swagger-ui/index.html#/

- Criar uma API que permita CRUD (Create, Read, Update, Delete) de tarefas.
- Implementa autenticação de usuários.
- Utilizar um banco de dados SQLite para armazenar as tarefas.
- Documenta todo o processo com Swagger

## Requisitos Funcionais:
- Criar Tarefa: Endpoint para criar uma nova tarefa.
- Listar Tarefas: Endpoint para listar todas as tarefas.
- Atualizar Tarefa: Endpoint para atualizar uma tarefa existente.
- Deletar Tarefa: Endpoint para deletar uma tarefa existente.

## Autenticação de Usuários:

- Registro de Usuário: Endpoint para registrar um novo usuário.
- Login de Usuário: Endpoint para autenticar um usuário e gerar um token JWT.
- Proteção de Rotas: Garantir que apenas usuários autenticados possam acessar os endpoints de tarefas.

## Banco de Dados:
- Utilizar SQLite como banco de dados para armazenar informações de usuários e tarefas.

## Entregáveis:
   1. **Código Fonte:**
      - Código fonte do projeto, organizado conforme a estrutura acima.
   2. **Repositório GitHub:**
      - Repositório público contendo o código fonte e documentação.
   3. **Documentação:**
      - README.md com instruções sobre como configurar e executar o projeto, além de detalhes dos endpoints da API.

### Detalhes Técnicos: 🔧
- **Boas Práticas:** Utiliza boas práticas de código limpo, legível e bem documentado.
- **Git:** Utiliza Git para controle de versão.
- **Criada do Zero:** projeto desenvolvido completamente do zero.

---
### Como rodar o projeto localmente:


Este é um projeto desenvolvido em **Spring Boot** que utiliza um banco de dados **SQLite** já configurado. Você pode executar o projeto localmente sem necessidade de configurações adicionais de banco de dados.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas no seu ambiente local:
- **Java 17** ou superior
- **Maven**
- **Git**

## Como executar o projeto localmente

1 Clone o repositório:
   
git clone git@github.com:PedroLeonCarvalho/desafio-trilha-back-end-codigo-certo.git

2 Acesse a pasta do projeto:

cd desafio-trilha-back-end-codigo-certo

3 Compile e empacote o projeto (opcional, caso deseje rodar o jar diretamente):

mvn package

4 Execute o projeto:

mvn spring-boot:run

5 Acesse a aplicação no navegador ou via API no endereço:

http://localhost:8080



