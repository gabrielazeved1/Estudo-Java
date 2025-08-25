package ClasseAbstrata;

abstract class FiguraGeometrica{
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Triangulo extends FiguraGeometrica{
    // atributos
    private double altura;
    private double base;

    // construtor do triangulo
    public Triangulo(double altura, double base){
        this.base = base;
        this.altura = altura;
    }

    // reescrever metodos 
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro(){
        double hipotenusa = Math.sqrt((base * base) + (altura * altura));
        return base + altura + hipotenusa;
    }


}
class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}


public class Main {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        System.out.println("Area do retangulo: "+ retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: "+ retangulo.calcularPerimetro());

        System.out.println("==================== Agora vou fazer do triangulo =====================");
        Triangulo triangulo = new Triangulo(15, 10);
        System.out.println("Area do triangulo: "+ triangulo.calcularArea());
        System.out.println("Perimetro do triangulo: "+ triangulo.calcularPerimetro());

    }
}
