# Senai Eventos

Bem-vindo ao projeto **Senai Eventos**, um sistema para gerenciamento de eventos que permite criar, visualizar, editar e excluir eventos de forma prática e eficiente.

## Funcionalidades

- **Cadastro de eventos**: Permite adicionar novos eventos com informações como nome, data, local e descrição.
- **Listagem de eventos**: Exibe todos os eventos cadastrados em uma interface amigável.
- **Edição de eventos**: Possibilidade de alterar informações de eventos existentes.
- **Exclusão de eventos**: Remove eventos do sistema.
- **Autenticação de usuários**: Sistema de login para acesso seguro.
- **Responsividade**: Interface adaptada para dispositivos móveis e desktops.

## Instalação

Siga os passos abaixo para configurar o projeto localmente:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/senai-eventos.git
   cd senai-eventos-main
   ```

## Endpoints da API -

### Autenticação(em desenvolvimento)
- **POST** `/api/auth/login`: Realiza o login do usuário.
- **POST** `/api/auth/register`: Registra um novo usuário.

### Eventos
- **GET** `/api/events`: Retorna a lista de todos os eventos.
- **GET** `/api/events/:id`: Retorna os detalhes de um evento específico.
- **POST** `/api/events`: Cria um novo evento.
- **PUT** `/api/events/:id`: Atualiza as informações de um evento existente.
- **DELETE** `/api/events/:id`: Remove um evento.

### Usuários
- **GET** `/api/users`: Retorna a lista de usuários (requer autenticação).
- **GET** `/api/users/:id`: Retorna os detalhes de um usuário específico.
- **PUT** `/api/users/:id`: Atualiza as informações de um usuário.
- **DELETE** `/api/users/:id`: Remove um usuário.
