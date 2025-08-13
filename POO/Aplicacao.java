package POO;
import POO.Livro;

public class Aplicacao {
    public static void main(String[] args) {
        // Criando um objeto Livro usando o construtor com todos os parâmetros
        Livro livro1 = new Livro("1984", "George Orwell", 1949, 29.90);

        
        // Criando um objeto Livro usando o construtor sem parâmetros
        Livro livro2 = new Livro();
        
        // Criando um objeto Livro usando o construtor com dois parâmetros
        Livro livro3 = new Livro("Brave New World", "Aldous Huxley");
        
        // Exibindo informações dos livros
        System.out.println("Livro 1: " + livro1.titulo + ", Autor: " + livro1.getAutor() + 
                           ", Ano: " + livro1.anoPublicacao + ", Preço: R$" + livro1.preco);
        System.out.println("Livro 2: " + livro2.titulo + ", Autor: " + livro2.getAutor() + 
                           ", Ano: " + livro2.anoPublicacao + ", Preço: R$" + livro2.preco);
        System.out.println("Livro 3: " + livro3.titulo + ", Autor: " + livro3.getAutor() + 
                           ", Ano: " + livro3.anoPublicacao + ", Preço: R$" + livro3.preco);
    }
}
