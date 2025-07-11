# 🔐 Microserviço de Autenticação de Usuários - Authuser

## 📖 Sobre o Projeto
Este é um microserviço desenvolvido com **Spring Boot** para gerenciar a autenticação de usuários em uma plataforma de **Educação a Distância (EAD)**. Ele oferece funcionalidades essenciais como cadastro, consulta e exclusão de usuários, utilizando uma arquitetura **RESTful** e banco de dados **PostgreSQL**. Este serviço faz parte de um ecossistema maior de microsserviços voltado à gestão de escolas EAD.

---

## ✨ Funcionalidades Principais
- **Cadastro de Usuários** (`POST /auth/signup`): Registra novos usuários com validação de dados.
- **Consulta de Usuários** (`GET /users` e `GET /users/{id}`): Retorna todos os usuários ou um específico por ID.
- **Exclusão de Usuários** (`DELETE /users/{id}`): Remove um usuário com base no ID.
- **Validações**: Verifica se o e-mail e o nome de usuário já estão cadastrados.
- **API RESTful**: Endpoints bem estruturados para integração com outros serviços.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.5.3**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Maven**

---

## ⚙️ Pré-requisitos
Antes de rodar o projeto, você precisa ter:
- **JDK 17** ou superior
- **Maven 3.8** ou superior
- **PostgreSQL** instalado e configurado
- Variáveis de ambiente:
    DB_URL=jdbc:postgresql://localhost:5432/authuser
    DB_USERNAME=seu_usuario
    DB_PASSWORD=sua_senha
  
- Uma IDE de sua escolha (IntelliJ, Eclipse, VS Code)

---

## 🚀 Como Executar o Projeto

### 1. Clone o repositório
git clone <URL_DO_REPOSITORIO>
cd authuser

###  2. Configure as variáveis de ambiente

Edite o arquivo application.yaml.

Ou defina no terminal as variáveis DB_URL, DB_USERNAME e DB_PASSWORD.

### 3. Instale as dependências e execute o projeto

mvn clean install
mvn spring-boot:run

A aplicação estará disponível em:
📍 http://localhost:8087

📂 Estrutura do Projeto
Arquivo/Classe	Descrição
AuthuserApplication.java	Classe principal da aplicação Spring Boot
AuthenticationController.java	Endpoints de autenticação (/auth/signup)
UserController.java	Endpoints para consulta e exclusão de usuários
UserDTO.java	Objeto de transferência de dados para usuários
UserModel.java	Entidade do usuário no banco de dados
UserRepository.java	Interface de repositório JPA
UserService.java	Interface dos serviços de usuário
UserServiceImpl.java	Implementação dos serviços
application.yaml	Configurações do banco de dados e servidor
pom.xml	Dependências do projeto (Maven)

📋 Endpoints da API
🔐 Autenticação
POST /auth/signup
✅ Cria um novo usuário
⛔ Retorna 409 se e-mail ou username já existirem

👤 Usuários
GET /users
🔎 Retorna todos os usuários

GET /users/{id}
🔎 Busca usuário por ID
⚠️ 404 se não encontrado

DELETE /users/{id}
🗑️ Remove um usuário
⚠️ 404 se não encontrado

🤝 Contribuindo
Contribuições são bem-vindas!
Siga os passos abaixo:

# Faça um fork
git clone https://github.com/seu-usuario/authuser.git
cd authuser

# Crie uma branch
git checkout -b feature/nova-funcionalidade

# Commit suas alterações
git commit -m "Adiciona nova funcionalidade"

# Envie a branch para o repositório remoto
git push origin feature/nova-funcionalidade

Abra um Pull Request com uma descrição clara do que foi adicionado ou modificado.
