# Projeto REST API - Curso DevSuperior

Uma API REST desenvolvida em Java com Spring Boot, criada como projeto prático do curso do professor Nélio Alves (DevSuperior). O objetivo principal deste repositório é demonstrar e consolidar os fundamentos do desenvolvimento backend.

## 🚀 Tecnologias Utilizadas

* **Java**
* **Spring Boot**
* **Spring Data JPA / Hibernate**
* **Banco de Dados H2 em memória**
* **Maven**

## 🧠 Fundamentos Abordados

Sendo um projeto focado em solidificar conhecimentos, a aplicação implementa os seguintes conceitos:

* **Arquitetura em Camadas:** Divisão estrutural entre Controladores (Resources), Camada de Serviço (Services) e Acesso a Dados (Repositories).
* **Mapeamento Objeto-Relacional (ORM):** Mapeamento de entidades de domínio para tabelas do banco de dados relacional.
* **Tratamento de Exceções:** Interceptação padronizada de erros na API para retornar códigos e mensagens HTTP corretos e descritivos.
* **Database Seeding:** Povoamento inicial do banco de dados na inicialização da aplicação para facilitar o ambiente de testes.

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **Git** e o **Java** instalados na sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/ThiagoSilvaDev99/Projeto-Curso-Dev-Superior.git
   ```

3. Acesse a pasta do projeto:
   ```bash
   cd Projeto-Curso-Dev-Superior
   ```
   
4. Execute o projeto usando o Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
   
5. A API estará disponível no endereço`http://localhost:8080`.
6. Para visualizar o banco de dados em memória, acesse o console do H2 em `http://localhost:8080/h2-console`.
   
## 🌐 Endpoints Principais

Exemplos de rotas disponíveis na aplicação (você pode atualizar esta seção conforme for adicionando novos controladores):

### Usuários:

* **`GET /users` - Retorna a lista de usuários**
* **`GET /users/{id}` - Retorna um usuário específico pelo ID**

### Produtos & Categorias:

* **`GET /products` - Retorna a lista de produtos**

* **`GET /categories` - Retorna as categorias cadastradas**

## Autor

Desenvolvido por Thiago Silva.