package POO;
// vou aplicar conceitos de POO, Classes, Objetos, Atributos e Métodos, e construtor

// esse é a classe Funcionario, que representa um funcionário de uma empresa
// ela tem atributos como nome, cargo e idade, e um construtor para inicializar esses
public class Funcionario {
    String nome;
    String cargo;
    int idade;
// este é o construtor da classe Funcionario, que recebe os parâmetros nome, cargo e idade
// e inicializa os atributos correspondentes
// toda vez que instanciarmos um objeto da classe Funcionario, esse construtor será chamado
    Funcionario(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }
    public static void main(String[] args){
        // aqui estamos criando um objeto do tipo Funcionario
        // passando os valores para o construtor
        Funcionario funcionario = new Funcionario("João", "Desenvolvedor", 30);
        
        // imprimindo os atributos do objeto funcionario
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);
    }

}
