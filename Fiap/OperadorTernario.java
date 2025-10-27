package Fiap;
// quero fazer uma aplicacao para que eu veja a utilizacao do operador ternario e consiga 
// entender sua logica 
public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 18;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado); // Saída: Maior de idade

        int numero = 10;
        String tipo = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(tipo); // Saída: Par

        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("O maior número é: " + max); // Saída: O maior número é: 20
    }

}
