package POO;

public class AplicacaoPessoa {
    Pessoa pessoa = new Pessoa();
    // Classe principal para testar a classe Pessoa

    public static void main(String[] args){
        AplicacaoPessoa app = new AplicacaoPessoa();
        
        app.pessoa.setIdade(30); // Usando o método set para definir a idade
        System.out.println("Idade: " + app.pessoa.getIdade()); // Usando o método get para obter a idade
       
        app.pessoa.nome = "João"; // Acessando atributo público diretamente
        System.out.println("Nome: " + app.pessoa.nome);
       
        // Atributos protegidos e padrão não podem ser acessados diretamente aqui, pois estão fora do pacote ou da hierarquia de herança.
        app.pessoa.getIdade(); // Chamada para garantir que o método getIdade funcione
       
        app.pessoa.endereco = "Rua Exemplo"; // Acesso permitido se AplicacaoPessoa for uma subclasse de Pessoa
        System.out.println("Endereço: " + app.pessoa.endereco);
       
        System.out.println("================================================================  ");
       
        app.pessoa.telefone = 123456789; // Acesso permitido se AplicacaoPessoa estiver no mesmo pacote
        System.out.println("Telefone: " + app.pessoa.telefone);

        System.out.println("================================================================  ");
        app.pessoa.setIdade(25);
        System.out.println("Nova Idade: " + app.pessoa.getIdade());

        app.pessoa.telefone = 1; // Acesso permitido se AplicacaoPessoa estiver no mesmo pacote
        System.out.println(" Novo Telefone: " + app.pessoa.telefone);
    }
}
