package aula01;
// Declaração da classe Padaria
// Uma classe é a estrutura básica de um programa Java. Aqui, estamos criando uma classe chamada "Padaria".
public class Padaria {

    // Declaração de variáveis de instância
    // Essas variáveis representam os atributos da classe Padaria. Cada instância da classe terá esses valores.
    int quantidadeFarinha = 10; // Quantidade de farinha disponível (em kg, por exemplo)
    int quantidadeAcucar = 5;   // Quantidade de açúcar disponível (em kg, por exemplo)

    // Método principal (main)
    // Este é o ponto de entrada do programa. A JVM (Java Virtual Machine) começa a execução do programa a partir deste método.
    public static void main(String[] args) {
        // Criação de uma instância da classe Padaria
        // Aqui, estamos criando um objeto da classe Padaria chamado "padaria".
        Padaria padaria = new Padaria();

        // Exibição dos valores das variáveis de instância
        // Usamos System.out.println para imprimir os valores no console.
        System.out.println("Quantidade de farinha: " + padaria.quantidadeFarinha); // Exibe a quantidade de farinha
        System.out.println("Quantidade de açúcar: " + padaria.quantidadeAcucar);   // Exibe a quantidade de açúcar
    }
}