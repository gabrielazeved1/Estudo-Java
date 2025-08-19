package Heranca;

class Veiculo{
    void acelerar() {
        System.out.println("Acelerando o veículo");
    }
}

class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Acelerando o carro");
        super.acelerar(); // Chama o método da classe pai
    }
}

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.acelerar(); // Saída: Acelerando o carro
    }   
}
