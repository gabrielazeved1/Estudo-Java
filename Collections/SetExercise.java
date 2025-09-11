package Collections;
import java.util.HashSet;
import java.util.Set;

// set nao pode valores duplicados


public class SetExercise {
    public static void main(String[] args) {
        // inicializar conjunto
        Set<Integer> numeros = new HashSet<>();

        //adicioonar numeros inteiros ao conjunto 
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        // verificar se um numero especifico esta presente -> TRUE
        boolean contemNumero = numeros.contains(8);
        //imprimir TRUE
        System.out.println("O conjunto comtem o numero 8? " + contemNumero);
        
        // remover um numero especifico do conjunto 
        numeros.remove(8);
        
        // imprimir ate 7
        // imprimir o resto dos numeros
        System.out.println("O conjunto é composto por: " + numeros);


    }
}
