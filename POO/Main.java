package POO;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Produto
        Produto produto1 = new Produto("Notebook", 1500.00, 20);
        Produto produto2 = new Produto("Smartphone", 2500.00, 10);

        // Exibindo informações dos produtos
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
    }
}