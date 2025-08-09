package POO;

public class Carro {
    String marca;
    String modelo;
    int ano;

    // esse é um construtor default
    // ele é chamado quando não passamos nenhum parâmetro
    // para criar um objeto da classe Carro
    // nesse caso, os atributos serão inicializados com seus valores padrão
    // (null para String e 0 para int)
    Carro(){

    }
    // construtores com parâmetros
    // esses construtores permitem que criemos objetos da classe Carro
    // com valores específicos para os atributos marca, modelo e ano
    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // outro construtor com apenas marca e modelo
    // nesse caso, o ano será inicializado com o valor padrão 0
    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    // perceber que estou usando a sobrecarga de construtores
    // para criar diferentes formas de instanciar a classe Carro


    // crie um metodo=funcao para printar os dados do carro
    // esse método exibe os dados do carro no console
    // ele pode ser chamado em qualquer objeto da classe Carro
    // para exibir suas informações
    // o método não retorna nenhum valor (void)
    // e usa o modificador public para que possa ser acessado de fora da classe
    public  void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
    public static void main(String[] args){
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic");
        Carro carro3 = new Carro();
        carro1.exibirDados();
        carro2.exibirDados();
        carro3.exibirDados(); // Exibe os dados do carro com valores padrão
    }
}
