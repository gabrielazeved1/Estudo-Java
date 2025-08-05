# Passo a passo para criar e rodar projetos JavaFX usando Sublime Text no macOS

---

## 1. Criar a pasta do projeto

No terminal, crie uma pasta para seu novo projeto e entre nela:

    mkdir ~/meu-projeto-javafx
    cd ~/meu-projeto-javafx

---

## 2. Abrir a pasta no Sublime Text

No terminal, execute:

    subl .

---

## 3. Criar os arquivos fonte

No Sublime Text, crie os arquivos `.java` necessários para seu projeto JavaFX.

Lembre-se de que sua classe principal deve estender `javafx.application.Application`.

---

## 4. Compilar o projeto

No terminal, dentro da pasta do projeto, rode o comando:

    javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml [arquivos].java

> Substitua `[arquivos].java` pelos arquivos Java do seu projeto.

---

## 5. Executar o projeto

Ainda no terminal, rode:

    java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml [ClassePrincipal]

> Substitua `[ClassePrincipal]` pelo nome da sua classe principal (com método `launch`).

---

## 6. Dicas

- Configure a variável de ambiente `PATH_TO_FX` para o caminho do JavaFX SDK.
- Utilize scripts `.sh` para automatizar compilação e execução.
- Organize seu código em pacotes se o projeto crescer.
- Sempre abra a pasta do projeto com `subl .` para facilitar a edição.

---

Esse fluxo serve para todos os seus projetos JavaFX, apenas altere os nomes das pastas, arquivos e classes conforme precisar.