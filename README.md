# 💰 Controle de Gastos - Spring Boot + HTMX

Este é um projeto prático de um sistema de **Controle de Gastos** desenvolvido do zero. A aplicação utiliza o padrão arquitetural MVC (Model-View-Controller) e foca na criação de uma interface limpa, rápida e altamente reativa, eliminando a necessidade de frameworks JavaScript complexos no front-end por meio do uso combinado do Thymeleaf com o HTMX.

---

## 🚀 Inicialização do Projeto

A estrutura base deste projeto foi gerada utilizando o **[Spring Initializr (start.spring.io)](https://start.spring.io/)**, a ferramenta oficial de bootstrap do ecossistema Spring. 

Através do Spring Initializr, definimos o gerenciador de dependências **Maven**, a linguagem **Java 21** e selecionamos os componentes iniciais do projeto para construir uma aplicação web robusta, modular e de fácil manutenção desde o primeiro commit.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Framework Principal:** Spring Boot 4.1.0
* **Persistência de Dados:** Spring Data JPA / Hibernate
* **Banco de Dados de Dev:** H2 Database (Banco em memória)
* **Motor de Templates:** Thymeleaf
* **Interatividade Reativa:** HTMX (via CDN)
* **Gerenciador de Dependências:** Maven

---

## 📁 Estrutura do Projeto

O projeto segue a divisão clássica de responsabilidades em camadas dentro do pacote principal `com.luisfatec.demo`:

```text
src/main/java/com/luisfatec/demo/
 │
 ├── model/          # Camada de Entidades (Mapeamento Relacional/JPA)
 │    └── Gasto.java # Atributos do gasto (id, descricao, valor, data)
 │
 ├── repository/     # Camada de Acesso ao Banco (Spring Data JPA)
 │    └── GastoRepository.java # Interface com CRUD automatizado
 │
 ├── controller/     # Camada de Controle (Rotas e Endpoints)
 │    └── GastoController.java # Endpoints GET, POST e DELETE
 │
 └── DemoApplication.java # Classe principal que inicializa o Spring Boot
