package Interface;

interface Produto{
    String getNome();
    int getQuantidade();
    void adicionarQuantidade( int quantidade);
    void removerQuantidade( int quantidade);
}

class ProdutoImpl implements Produto{
    private String nome;
    private int quantidade;

    // criar construtor 
    public ProdutoImpl(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public int getQuantidade(){
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade){
        if (this.quantidade >= quantidade){
            this.quantidade -= quantidade;
        }
        else{
            System.out.println("Quantidade insuficiente em estoque");
        }
        
    }
}


public class ControleEstoque {
    public static void main(String[] args) {
        Produto produto = new ProdutoImpl("Caneca", 50);
        System.out.println("Produto " + produto.getNome());
        System.out.println("Quantidade " + produto.getQuantidade());

        produto.adicionarQuantidade(50);
        System.out.println("O novo valor de quantidade após adicao é: " + produto.getQuantidade());

        produto.removerQuantidade(101);
        System.out.println("=================== Vai dar que nao tem estoque suficiente");

        produto.removerQuantidade(70);
        System.out.println("O novo valor de estoque apos a remocao é: " + produto.getQuantidade());

// Isso é chamado de programar para a interface e não para a implementação.
//Em Java (e em POO no geral), é uma boa prática declarar a variável usando o tipo mais genérico possível (interface ou classe abstrata), mas instanciar com a implementação concreta.

    }
}
