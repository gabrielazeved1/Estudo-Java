package aula01;
public class CalculadoraRetangulo {
    double largura = 5.0;
    double altura = 3.0;

    double calcularArea(){
        return largura * altura;

    }
    public static void main (String[]args){
        CalculadoraRetangulo calculadora = new CalculadoraRetangulo();
        double area = calculadora.calcularArea();
        System.out.println("A área do retângulo é: " + area);
    }

}
