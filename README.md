# MS Address

## Descrição
Este é o repositório para o projeto MS Address, que faz parte do desafio durante meu estágio na Compass UOL. O MS Address tem como objetivo gerenciar informações relacionadas a endereços junto o MS User.
## Pré-requisitos
- Java 17
- Maven
- MySql
- RabbitMQ

## Configuração

### Banco de Dados MongoDB
- Atualize as configurações do banco de dados no arquivo `application.yml`.

## Como Executar
1. Clone o repositório: `git clone https://github.com/loudedje/ms-address.git`
2. Navegue até o diretório do projeto: `cd ms-address`
3. Execute o projeto: `mvn spring-boot:run`

O aplicativo estará disponível em `http://localhost:8082` por padrão.

## Endpoints

### Endereços.
- `GET /v1/addresses/{cep}`: Obtém informações sobre um endereço específico.

## Dependências
- MS User: https://github.com/loudedje/user-management-project_Ms_User.git


