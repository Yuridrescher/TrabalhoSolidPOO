# SaborExpress - Sistema de Delivery 🍔🚀

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO), com o objetivo de criar um sistema simples de delivery utilizando conceitos como os cinco princípios SOLID, encapsulamento, herança, polimorfismo e tratamento de exceções.

## 📂 Estrutura do Projeto

O projeto está organizado em pacotes dentro da pasta `saborexpress`, separando as classes de acordo com suas funções:

```text
saborexpress/
├── app/               # Classe principal e execução do sistema
├── excecao/           # Exceções personalizadas
├── interfaces/        # Interfaces utilizadas no projeto
├── modelo/            # Classes de clientes, pratos e pedidos
└── servico/           # Controle dos pedidos e geração de relatórios
```

## 🛠️ Aplicação dos Princípios SOLID

Durante o desenvolvimento, foram utilizados os cinco princípios SOLID para organizar melhor o código e facilitar futuras alterações.

**S - Single Responsibility Principle (Responsabilidade Única)**

As classes foram separadas conforme suas responsabilidades. Por exemplo, as classes Cliente e Prato armazenam os dados, Pedido organiza os itens e realiza os cálculos, enquanto ControlePedidos gerencia os pedidos do dia. Já as classes de gravação ficam responsáveis pela geração dos relatórios.

**O - Open/Closed Principle (Aberto/Fechado)**

O sistema permite adicionar novos tipos de pratos sem precisar modificar as classes que já existem. Por exemplo, seria possível criar um novo tipo chamado PratoDiet, aproveitando a estrutura da classe Prato.

**L - Liskov Substitution Principle (Substituição de Liskov)**

As subclasses de Prato, como PratoExecutivo, Combo e PratoEspecial, podem ser utilizadas no lugar da classe principal, mantendo o funcionamento esperado do sistema.

**I - Interface Segregation Principle (Segregação de Interfaces)**

Foram criadas interfaces menores e específicas, como Calculavel e GravadorRelatorio. Dessa forma, cada classe implementa apenas os métodos que realmente precisa utilizar.

**D - Dependency Inversion Principle (Inversão de Dependência)**

A classe ControlePedidos trabalha com a interface GravadorRelatorio, sem depender diretamente de uma implementação específica. Assim, é possível escolher como o relatório será gerado, seja no console ou em um arquivo, utilizando a injeção de dependência pelo construtor.

## - Como Compilar e Executar

### Pré-requisitos

- JDK instalado (versão 11 ou superior).
- Terminal ou ambiente de desenvolvimento com suporte a Java.

### Executando pelo terminal

1. Abra o terminal na pasta principal do projeto, onde está localizada a pasta `saborexpress`.
2. Compile os arquivos Java:

```bash
javac saborexpress/**/*.java
```

3. Execute a classe principal:

```bash
java saborexpress.app.Principal
```

## 💡 Funcionalidades

O sistema apresenta as seguintes funcionalidades:

- Cadastro de clientes com validação dos dados.
- Criação de diferentes tipos de pratos: Executivo, Combo e Especial.
- Registro de pedidos em uma lista diária do restaurante.
- Validação das regras de negócio, impedindo situações como preços negativos e pedidos sem cliente associado.
- Tratamento de exceções personalizadas para evitar que erros interrompam a execução.
- Fechamento do dia com geração de relatório, mostrando os pedidos registrados, o faturamento total e o pedido de maior valor.

---

**Projeto acadêmico desenvolvido para colocar em prática os conceitos de Programação Orientada a Objetos em Java, Especificamente O uso e abordagem dos 5 Principios do Solid que facilitam o processo de desenvolvimento — o que facilita a manutenção e a expansão do software.**
