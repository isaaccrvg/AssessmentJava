
# 🚀 Java Developer Bootcamp - Exercícios Práticos

Este repositório contém uma série de exercícios voltados para o aprendizado da linguagem Java, com foco em práticas essenciais de desenvolvimento, orientação a objetos, manipulação de arquivos e simulações de sistemas do mundo real.

## 📦 Parte 1 - Configuração do Ambiente

### 🧪 Exercício 1 - Instalando e Configurando o Ambiente Java

**Objetivo**: Preparar o ambiente de desenvolvimento Java.

**Tarefas**:
- Instalar o JDK mais recente e configurar as variáveis de ambiente.
- Instalar a IDE IntelliJ IDEA.
- Criar um projeto chamado `MinhaPrimeiraApp`.
- Criar a classe `OlaMundo` com a mensagem:
  ```
  Olá, meu nome é [Seu Nome] e estou aprendendo Java!
  ```
- Build e execução do projeto pelo console da IDE.

**Entrega**:
- Screenshot do terminal com `java -version`.
- Screenshot da configuração do JDK na IDE.
- Screenshot da execução do programa.

---

## 📘 Parte 2 - Conceitos Básicos da Linguagem

### 🔐 Exercício 2 - Validação de Senha Segura

**Objetivo**: Validar senhas fortes antes de cadastrar um usuário.

**Requisitos da Senha**:
- Mínimo de 8 caracteres.
- Pelo menos uma letra maiúscula, um número e um caractere especial.

**Funcionalidade**:
- Solicita nome e senha.
- Exibe erro específico se a senha for inválida.
- Permite nova tentativa até ser válida.

---

### 💰 Exercício 3 - Calculadora de Impostos

**Objetivo**: Calcular imposto de renda com base no salário anual.

**Faixas de Imposto**:
- Até R$ 22.847,76 → Isento
- R$ 22.847,77 a R$ 33.919,80 → 7,5%
- R$ 33.919,81 a R$ 45.012,60 → 15%
- Acima de R$ 45.012,61 → 27,5%

**Funcionalidade**:
- Solicita nome e salário mensal.
- Calcula imposto e salário líquido.

---

### 🏦 Exercício 4 - Simulador de Empréstimo Bancário

**Objetivo**: Simular um empréstimo com parcelas e juros fixos.

**Detalhes**:
- Solicita nome, valor e número de parcelas (6 a 48).
- Aplica juros fixo de 3% ao mês.
- Exibe valor total pago e valor de cada parcela.

---

### 🌐 Exercício 5 - Programa CGI em Java

**Objetivo**: Simular um script CGI (Common Gateway Interface).

**Requisitos**:
- Imprimir headers HTTP, incluindo `Content-Type: text/html`.
- Exibir conteúdo HTML:
  ```html
  <html>
  <head><title>Saudação CGI</title></head>
  <body>
  <h1>Olá, Terráqueos!</h1>
  </body>
  </html>
  ```

---

## 🧱 Parte 3 - Classes e Objetos

### 🚗 Exercício 6 - Cadastro de Veículos

**Objetivo**: Criar uma classe `Veiculo` com:

- Atributos: placa, modelo, ano, quilometragem.
- Métodos: `exibirDetalhes()`, `registrarViagem(double km)`.

**Testes no `main()`**:
- Criar dois veículos e registrar viagens.

---

### 🎓 Exercício 7 - Gerenciador de Alunos

**Objetivo**: Criar uma classe `Aluno` com:

- Atributos: nome, matrícula, três notas.
- Métodos:
  - `calcularMedia()`
  - `verificarAprovacao()` (média >= 7)

**Testes no `main()`**:
- Solicitar dados e exibir situação final.

---

## 🧠 Parte 4 - Orientação a Objetos Avançada

### 🧑‍💼 Exercício 8 - Sistema de Funcionários

**Objetivo**: Calcular salários com base em cargos.

- Classe `Funcionario`: nome, salário base.
- Subclasses:
  - `Gerente`: +20% de bônus.
  - `Estagiario`: -10% de desconto.

**Testes no `main()`**:
- Criar um gerente e um estagiário, exibir salários finais.

---

### 🏦 Exercício 9 - Conta Bancária com Encapsulamento

**Objetivo**: Proteger os dados da conta.

- Classe `ContaBancaria`:
  - Atributos: titular, saldo (privado).
  - Métodos:
    - `depositar(double valor)`
    - `sacar(double valor)`
    - `exibirSaldo()`

**Testes no `main()`**:
- Criar conta, realizar operações e exibir saldo.

---

## 💾 Parte 5 - Manipulação de Arquivos e Estruturas Avançadas

### 🧾 Exercício 10 - Registro de Compras

**Objetivo**: Armazenar compras em arquivo.

- Cadastrar 3 compras: produto, quantidade, preço.
- Salvar em `compras.txt`.
- Ler o arquivo e exibir os dados.

---

### 🎲 Exercício 11 - Simulação de Loteria

**Objetivo**: Criar um jogo simples de loteria.

- Gerar 6 números aleatórios (1 a 60).
- Solicitar 6 números do usuário.
- Comparar e informar acertos.

---

### 💬 Exercício 12 - Sistema de Chat com Arrays

**Objetivo**: Simular um chat em linha de comando.

**Regras**:
- Dois usuários trocam até 5 mensagens cada (10 no total).
- Mensagens armazenadas em `Array` de `String`.
- Alternância de envio entre os usuários.
- Exibir histórico ao final.

**Mensagem final**:
```
Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀
```

---

## 🧑‍🏫 Considerações Finais

Esses exercícios cobrem fundamentos essenciais da linguagem Java e são ideais para quem está começando sua jornada no desenvolvimento de software com foco em aplicações reais e práticas. Cada exercício foi pensado para exercitar um conceito chave da linguagem.

---

## 💡 Como Executar

1. Clone o repositório:
```bash
https://github.com/isaaccrvg/AssessmentJava.git
```
2. Abra o projeto na IntelliJ IDEA.
3. Execute os arquivos `Main.java` de cada exercício.

---

## 🧑‍💻 Autor

**Marcos isaac**  
Aprendendo Java ☕ com entusiasmo e dedicação!
