# 🥒 Automated Test Project - Cucumber, Selenium & Java (POM)

[![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=openjdk)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-4.x-green?style=flat-square&logo=selenium)](https://www.selenium.dev/)
[![Cucumber](https://img.shields.io/badge/Cucumber-BDD-brightgreen?style=flat-square&logo=cucumber)](https://cucumber.io/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=flat-square&logo=apache-maven)](https://maven.apache.org/)

Projeto de automação de testes End-to-End (E2E) desenvolvido em **Java**, utilizando **Selenium WebDriver** para interação com o navegador, **Cucumber** para a abordagem BDD (Behavior-Driven Development) com arquivos Gherkin, e aplicando o padrão de design **Page Object Model (POM)** para garantir a manutenibilidade e escalabilidade do código.

Atualmente, o projeto conta com uma cobertura de testes focada no fluxo de **Login**.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Java (JDK 17+)** — Linguagem de programação principal.
* **Selenium WebDriver** — Automação de interações web.
* **Cucumber** — Especificação executável de testes utilizando BDD (Gherkin).
* **Maven** — Gerenciador de dependências e construção do projeto.
* **JUnit** — Orquestrador de execução dos testes.
* **Page Object Model (POM)** — Design pattern para separação de responsabilidades e elementos de tela.

---

## 📁 Estrutura do Projeto

O projeto segue uma arquitetura organizada em camadas para facilitar a manutenção:

```text
cucumber-Selenium_POM/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── core/         # Configurações de driver, base pages e infraestrutura
│   │   │   ├── maps/         # Mapeamento de elementos / locators (opcional/integrado nas pages)
│   │   │   ├── pages/        # Classes do Page Object Model (ações da tela)
│   │   │   ├── runners/      # Classe Runner para disparar os testes do Cucumber
│   │   │   └── steps/        # Definições de passos (Step Definitions) mapeando o Gherkin
│   │   │
│   │   └── resources/
│   │       └── features/     # Cenários de teste escritos em Gherkin (.feature)
│   │
└── pom.xml                   # Dependências do Maven
```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
Certifique-se de ter instalado em sua máquina:
* **JDK 17** (ou superior) configurado nas variáveis de ambiente.
* **Maven** instalado.
* **Google Chrome** (ou o navegador de sua preferência configurado no projeto) e o respectivo driver (gerenciado automaticamente pelo Selenium 4+).

### Passos para execução:

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/cucumber-Selenium_POM.git
   ```
2. Abra o projeto na sua IDE favorita (IntelliJ IDEA, Eclipse, VS Code).
3. Restaure as dependências do Maven.
4. Execute os testes via terminal utilizando o Maven:
   ```bash
   mvn test
   ```
   Ou localize a classe **Runner** na pasta `runners`, clique com o botão direito e selecione **Run**.

---

## 📝 Exemplo de Cenário (Gherkin)

Os testes são descritos em linguagem natural utilizando Gherkin:

```gherkin
# language: pt
Funcionalidade: Realizar Login
  Como um usuário do sistema
  Quero me autenticar com credenciais válidas
  Para acessar o painel principal

  Cenário: Login com sucesso
    Dado que estou na página de login
    Quando preencho as credenciais válidas
    E clico no botão de entrar
    Então sou redirecionado para o painel com sucesso
```

---

## 👩‍💻 Autor

Desenvolvido por Karina Abreu.  
[LinkedIn](https://www.linkedin.com/in/karina-abreu-23bb8824/)
