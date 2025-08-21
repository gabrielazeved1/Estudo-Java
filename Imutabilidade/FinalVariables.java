package Imutabilidade;

public class FinalVariables {
    private final int numeroMaximo = 100;
    private final String mensagem = "Bem-vindo ao sistema!";

    // Construtor para usar as variaveis privadas e finais.
    // nunca usar set para variaveis finais
    // nao faz sentido usar contrutor para variaveis finais, visto que ja sao definidos na criacao
    // é uma boa pratica fazer getters para acessar os valores, mas como estou na propria classe nao é necessario

    public int getNumeroMaximo() {
        return numeroMaximo;
    }
    public String getMensagem() {
        return mensagem;
    }
    public static void main(String[] args) {
        FinalVariables finalVars = new FinalVariables();
        System.out.println("Número Máximo: " + finalVars.getNumeroMaximo());
        System.out.println("Mensagem: " + finalVars.getMensagem());
        
        // Tentando alterar os valores finais (isso causaria erro de compilação)
        // finalVars.numeroMaximo = 200; // Não é permitido
        // finalVars.mensagem = "Nova mensagem"; // Não é permitido
    }


}
