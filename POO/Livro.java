package POO;

public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco; // Atributo com visibilidade padrão e default access modifier

    // Contrutores
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    // Construtor sem parâmetros
    public Livro () {
        this.titulo = "Título Desconhecido";
        this.autor = "Autor Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    // Construtor com dois parâmetros
    public Livro (String titulo , String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    // para ler o atributo privado autor é preciso fazer um método público usando o getter
    public String getAutor(){
        return autor;
    }
}
