package Heranca;

// Classe base (pai)
class Funcionario {
    private String nome;
    private double salario;

    // Métodos getters e setters para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor){
        salario += valor;
    }
    
    public double ganhoAnual(){
        return salario * 12;
    }
}

// Classe filha (não mais aninhada)
class Assistente extends Funcionario {
    private int numeroMatricula;

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + 1000; // Adiciona um bônus de 1000
    }
}

// Classe principal para testar o código
public class TesteHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente();
        
        // Agora podemos usar os setters para definir os valores
        assistente.setNome("João");
        assistente.setSalario(2000);

        // Aumenta o salário (opcional, pode vir depois)
        // assistente.addAumento(500);

        // Agora podemos usar os getters para obter os valores
        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário: " + assistente.getSalario());
        System.out.println("Ganho Anual: " + assistente.ganhoAnual());
    }
}