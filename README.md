# 🧠 ChatMultiGeração | API REST com Spring Boot + Swagger

Aplicação backend desenvolvida com foco na experiência personalizada do usuário, adaptando a interface e o fluxo de interação com base nas características do público. O projeto simula um chatbot inteligente com comportamento ajustado a diferentes perfis de uso e inclui um módulo de tickets internos para simular atendimento técnico.

A estrutura do projeto segue práticas corporativas inspiradas no Liquid Application Framework da Avanade, visando escalabilidade, organização e clareza entre as camadas da aplicação.

## 🎯 Objetivos

- Criar uma API REST em Java com Spring Boot
- Aplicar boas práticas de separação de responsabilidades
- Personalizar o fluxo de interação com base nas características do usuário
- Permitir que analistas internos acompanhem tickets abertos por usuários
- Adotar arquitetura que reflita soluções de mercado, como as usadas pela Avanade

## ⚙️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Maven
- Spring Web
- Spring Data JPA
- H2 Database (modo desenvolvimento)
- Swagger UI

## 🔁 Funcionalidades

### Usuário final:
- Acesso ao chatbot com interface adaptada ao perfil do usuário
- Abertura de tickets com descrição do problema
- Respostas personalizadas do sistema

### Analista interno:
- Listagem de todos os tickets
- Visualização e atualização do status de cada ticket
- (Futuro) login com autenticação básica para uso restrito

```markdown

## 🔖 Endpoints da API

| Método | Rota                       | Descrição                        |
|--------|----------------------------|----------------------------------|
| GET    | `/welcome`                 | Mensagem de boas-vindas          |
| POST   | `/tickets`                 | Abertura de novo ticket          |
| GET    | `/tickets`                 | Listagem de todos os tickets     |
| GET    | `/tickets/{id}`            | Detalhe de um ticket específico  |
| PUT    | `/tickets/{id}/status`     | Atualização de status de ticket  |
```

## 🧱 Estrutura de Pastas

📁 controller/
📁 service/
📁 repository/
📁 domain/
📁 dto/
📁 config/


## ▶️ Como executar localmente

```bash
# Clonar o repositório
git clone https://github.com/andrehlb/chatMultiGeração-API-REST-SpringBootSwagger.git

# Entrar na pasta
cd chatMultiGeração-API-REST-SpringBootSwagger

# Executar o projeto
./mvnw spring-boot:run

```
- Swagger UI: http://localhost:8080/swagger-ui/index.html
- Endpoint de exemplo: http://localhost:8080/welcome
---

## 📌 Possibilidades futuras

- Autenticação com JWT
- Banco PostgreSQL ou Azure SQL
- Integração com Azure Cognitive Services ou OpenAI
- Publicação da API em Railway ou Azure
- Frontend com React adaptável a perfis de usuário
- Integração com Power BI para visualização de dados dos tickets


## 🌍 Projetos relacionados

- Portfólio GitHub Pages: https://andrehlb.github.io
- Projeto Copilot Codespaces: https://andrehlb.github.io/andrehlb-mslearn-copilot-codespaces-javascript/


## 👨‍💻 Autor

**André HLB**  
Backend Java • REST APIs • Cloud & IA  
[linkedin.com/in/andrehlb](https://linkedin.com/in/andrehlb)

“Este projeto é de uso educacional e demonstra propósitos técnicos. Nenhum uso comercial está autorizado.”