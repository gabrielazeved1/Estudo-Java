package Interface;

interface Veiculo{
    // 
    void iniciar();
    void parar();
    // 
    default void buzinar(){
        System.out.println("Buzinando");
    }
}

class Carro implements Veiculo{
    public void iniciar(){
        System.out.println("Ligando o motor do carro");
    }
    public void parar(){
        System.out.println("Parando o motor do carro");
    }
}

class Caminhao implements Veiculo{
    public void iniciar(){
        System.out.println("Ligando o motor do caminhao");
    }
    public void parar(){
        System.out.println("Parando o motor do caminhao");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro fiat = new Carro();
        Caminhao transformes = new Caminhao();

        fiat.iniciar();
        fiat.buzinar();
        fiat.parar();

        transformes.iniciar();
        transformes.buzinar();
        transformes.parar();
    }
}
