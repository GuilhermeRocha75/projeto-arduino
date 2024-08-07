<!-- Área do Banner -->
<div align="center" style="background-color: white; max-width: 100%;">
  <img alt="BANNER com título: Comunicação entre PC e Arduino" title="Banner_PC_Arduino" src="img/ImgSaoLucas.PNG" width="100%" />
</div>

# README principal do Projeto

<div align="center"><h1>Comunicação entre PC e Arduino utilizando Software em Java</h1><p><b>Projeto de Interface de Comunicação Serial</b></p></div>

## Participantes

<div align="center">
  <table>
    <tr>
      <td align="center">
        <a href="https://github.com/EderRosso">
          <img src="https://avatars.githubusercontent.com/u/82277906?v=4" width="75px;" alt="Foto do Prof. Éder Oliveira de Rosso"/>
          <br />
          <sub><b>Prof. Éder de Rosso</b></sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/GuilhermeRocha75">
          <img src="https://avatars.githubusercontent.com/u/132854835?v=4" width="75px;" alt="Foto de Guilherme Rocha"/>
          <br />
          <sub><b>Guilherme Rocha</b></sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/RenanIsidoro08">
          <img src="https://avatars.githubusercontent.com/u/170661990?v=4" width="75px;" alt="Foto de Renan Isidoro"/>
          <br />
          <sub><b>Renan Isidoro</b></sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/ThaylonST">
          <img src="https://avatars.githubusercontent.com/u/136936975?v=4" width="75px;" alt="Foto de Thaylon dos Santos"/>
          <br />
          <sub><b>Thaylon dos Santos</b></sub>
        </a>
      </td>
    </tr>
  </table>
</div>

## Índice

1. [Introdução](#introdução)
2. [Objetivo do Sistema](#objetivo-do-sistema)
3. [Requisitos Funcionais](#requisitos-funcionais)
4. [Requisitos Não Funcionais](#requisitos-não-funcionais)
5. [Especificações Técnicas](#especificações-técnicas)
6. [Critérios de Aceitação](#critérios-de-aceitação)
7. [Estrutura do Repositório](#estrutura-do-repositório)
8. [Requisitos de Sistema](#requisitos-de-sistema)
9. [Instalação](#instalação)
10. [Contato](#contato)

## Introdução

Bem-vindo ao repositório principal do nosso projeto de comunicação entre um PC e uma placa Arduino utilizando software em Java! Este repositório contém todos os recursos necessários para o desenvolvimento e manutenção do sistema, incluindo especificações técnicas, requisitos, e guias de instalação e configuração.

## Objetivo do Sistema

O objetivo principal do sistema é desenvolver uma aplicação em Java que possibilite a comunicação serial entre um PC e uma placa Arduino. Esta aplicação deverá ser capaz de enviar comandos para o Arduino e receber dados enviados pela placa, permitindo a execução de tarefas específicas e a coleta de informações.

## Requisitos Funcionais

### 3.1. Interface do Usuário
- Deve fornecer uma interface gráfica para interação com o usuário.
- Deve permitir a seleção da porta serial.

### 3.2. Comunicação Serial
- Deve enviar comandos do PC para o Arduino.
- Deve receber dados do Arduino e exibi-los ao usuário.

### 3.3. Configuração da Conexão
- Deve permitir a configuração dos parâmetros de conexão serial (baud rate, paridade, etc.).

## Requisitos Não Funcionais

### 4.1. Desempenho
- O sistema deve responder aos comandos do usuário em tempo real.

### 4.2. Usabilidade
- A interface deve ser intuitiva e fácil de usar.

### 4.3. Confiabilidade
- O sistema deve ser estável e evitar falhas de comunicação.

### 4.4. Portabilidade
- O software deve ser compatível com Windows, macOS e Linux.

## Especificações Técnicas

### 5.1. Linguagem de Programação
- O software será desenvolvido em Java, utilizando bibliotecas específicas para comunicação serial, como a RXTX ou JSSC.

### 5.2. Estrutura de Dados
- Os dados serão trocados entre o PC e o Arduino em formato de texto, podendo ser estendidos para formatos binários conforme necessário.

### 5.3. Segurança
- O software deverá implementar medidas básicas de segurança para evitar conexões não autorizadas.

## Critérios de Aceitação
- O software deve ser capaz de listar e conectar-se às portas seriais disponíveis.
- Deve enviar e receber dados entre o PC e o Arduino corretamente.

## Estrutura do Repositório

```
/
├── docs/
│ ├── requisitos/
│ │ └── requisitos.md
│ ├── casos_de_uso/
│ │ └── casos_de_uso.md
│ └── README.md
├── img/
│ ├── Diagrama_de_Casos_de_Uso.png
│ └── README.md
├── src/
│ ├── main/
│ │ └── ... (código fonte do projeto)
│ └── test/
│ └── ... (testes do projeto)
├── img/
│ └── ImgSaoLucas.PNG
└── README.md
```

- **docs/**: Contém documentação do projeto, incluindo levantamento de requisitos e casos de uso.
- **src/**: Contém o código-fonte e os testes do projeto.
- **img/**: Contém imagem do cabeçalho do README principal.
- **README.md**: Documento principal com informações sobre o repositório.

## Requisitos de Sistema

- **Sistema Operacional**: Windows, macOS ou Linux
- **Linguagem de Programação**: Java 11 ou superior

## Instalação

Siga os passos abaixo para clonar e configurar o repositório em seu ambiente local:

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd nome-do-repositorio
   ```


## Contato

Para mais informações, entre em contato através do e-mail [ederderosso@gmail.com] ou visite nossa página de [Repositório](https://github.com/EderRosso/Analise-de-Sistemas).

---
