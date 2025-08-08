package operadores;

public class CalculadoraSimples {

    int a = 10;
    int b = 2;
    
    public static void main (String[] args){
        CalculadoraSimples calculadoraSimples =  new CalculadoraSimples();
        System.out.println("Soma:"+ (calculadoraSimples.a + calculadoraSimples.b));
        System.out.println("Subtracao:"+ (calculadoraSimples.a - calculadoraSimples.b));
        System.out.println("Multiplicacao:"+ (calculadoraSimples.a * calculadoraSimples.b));
        System.out.println("Divisao:"+ (calculadoraSimples.a / calculadoraSimples.b));
    }
}
