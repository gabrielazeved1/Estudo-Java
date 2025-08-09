package Loops;

public class SomaNumeros {
    public static void main(String[] args){
        int soma = 0;
        for(int i = 0; i <= 10; i++){
            soma +=i;
            System.out.println("Soma: " + soma);
        }
        System.out.println("A soma final é: " + soma);
    }
}
