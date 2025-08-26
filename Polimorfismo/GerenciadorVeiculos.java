package Polimorfismo;

abstract class Veiculo{
    
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }
    public void exibirInformacoes(){
        System.out.println("Placa: "+ placa);
        System.out.println("Ano: "+ ano);
    }

}

class Onibus extends Veiculo {
    private int assentos;
    public Onibus (String placa, int ano, int assentos){
        super(placa,ano);
        this.assentos = assentos;
    }
}

class Caminhao extends Veiculo {
    private int eixos;
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Eixos: " + eixos);
}
}

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Onibus("ABC123", 2020, 40);
        Veiculo veiculo2 = new Caminhao("XYZ123", 2018, 50);
        
        System.out.println("Detalhes do veiculo 1 (onibus): ");
        veiculo1.exibirInformacoes();
        System.out.println("");

        System.out.println("Detalhes do veiculo 2 (caminhao): ");
        veiculo2.exibirInformacoes();
    }
}
