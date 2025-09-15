package PFuncional;
// declara interface
@FunctionalInterface
interface Calculadora{

    double calcular(double a , double b);
}

// implementa reduzindo codigo 
public class CalculadoraComInterfaceFuncional {
    public static void main(String[] args) {
        
        Calculadora soma = (a,b) -> a + b;
        System.out.println("Soma: "+ soma.calcular(10, 5));

        Calculadora subtracao = (a,b) -> a - b;
        System.out.println("Subtracao: "+ subtracao.calcular(10, 5) );

        Calculadora multplicacao = (a,b) -> a * b;
        System.out.println("multplicacao: "+ multplicacao.calcular(10, 5) );

     }    


}
