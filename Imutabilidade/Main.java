package Imutabilidade;

class Calculadora{
    final int somar(int a , int b){
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora{
    // Nao consegue herdar pois o metodo de calculadora foi escrito com final  
    //@Override
    //public int somar(int a, int b) {
    //    return somar a+ b + 10; // Adiciona 10 ao resultado da soma
    //}
}


public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.somar(5, 3)); // Saída: Soma: 8

    }
}
