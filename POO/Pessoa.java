package POO;

public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    int telefone;

    // Metodo usando o get -> puxar o resultado da variavel privada
    public int getIdade() {
        return idade;
    }
    // Metodo usando o set -> atribuir um valor a variavel privada 
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
