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

No terminal, estando na pasta ~/projects/src/Java, rode o comando:

    javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -d . pasta/arquivo.java

> Substitua `pasta/[arquivos].java` pelos arquivos Java do seu projeto.

---

## 5. Executar o projeto

Ainda no terminal, rode:

    java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml pasta.classes

> Substitua `pasta.classes` pelo nome da sua classe principal (com método `launch`).

---

## 6. Dicas

- Configure a variável de ambiente `PATH_TO_FX` para o caminho do JavaFX SDK.
- Utilize scripts `.sh` para automatizar compilação e execução. -> ou makefile
- Sempre abra a pasta do projeto com `subl .` para facilitar a edição.

---
