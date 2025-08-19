package Heranca;

class Pessoa{
    private  String nome;
    private  int idade;
    //construtuor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //métodos getters para acessar os atributos
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}

class Estudante extends Pessoa {
    private  String matricula;
    //construtor da classe Estudante
    public Estudante(String nome, int idade, String matricula) {
        super(nome, idade); // Chama o construtor da classe Pessoa
        this.matricula = matricula;
    }
    //métodos getters para acessar os atributos
    public String getMatricula() {
        return matricula;
    }
}

public class Principal {
    public static void main(String[] args) {
        
        //vriar um objeto do tipo Estudante
        Estudante estudante = new Estudante ("João", 20, "123456");
        //imprimir os dados do estudante
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());

    }
}

