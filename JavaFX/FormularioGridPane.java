// Nome do arquivo: FormularioGridPane.java
package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormularioGridPane extends Application {

    @Override
    public void start(Stage palco) {
        // Define o título da janela
        palco.setTitle("Formulário com GridPane");

        // Criação dos elementos (rótulos, campos de texto e botão)
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("E-mail:");

        TextField campoNome = new TextField();
        campoNome.setPromptText("Digite seu nome"); // Texto de ajuda

        TextField campoEmail = new TextField();
        campoEmail.setPromptText("Digite seu e-mail"); // Texto de ajuda

        Button botaoEnviar = new Button("Enviar");

        // Criação do GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // Espaçamento horizontal entre células
        gridPane.setVgap(10); // Espaçamento vertical entre células
        gridPane.setPadding(new Insets(15, 15, 15, 15)); // Espaçamento externo (top, right, bottom, left)

        // Adição dos elementos ao GridPane em posições específicas
        // add(elemento, coluna, linha)
        gridPane.add(rotuloNome, 0, 0);
        gridPane.add(campoNome, 1, 0);
        gridPane.add(rotuloEmail, 0, 1);
        gridPane.add(campoEmail, 1, 1);
        gridPane.add(botaoEnviar, 1, 2);

        // Criação da cena e exibição do palco
        Scene cena = new Scene(gridPane, 350, 200);
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}