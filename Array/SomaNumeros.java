package Array;

public class SomaNumeros {
    // Agora são variáveis da classe, acessíveis em qualquer método.
    int[] numeros;
    int soma;

    public SomaNumeros() {
        // Inicializamos as variáveis aqui.
        numeros = new int[1000];
        soma = 0;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Usamos um loop 'for' tradicional para preencher o array e somar os valores.
        for (int i = 0; i < somaNumeros.numeros.length; i++) {
            // Acessamos o array através do objeto e preenchemos a posição 'i' com 'i + 1'
            somaNumeros.numeros[i] = i + 1;

            // Somamos o valor da posição 'i' à variável 'soma'
            somaNumeros.soma += somaNumeros.numeros[i];
        }

        // Imprimimos o resultado final.
        System.out.println("A soma dos números é: " + somaNumeros.soma);
    }
}