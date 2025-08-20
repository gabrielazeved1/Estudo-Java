package Annotations;

class MinhaClasse{
    public int  calcularSoma(int a, int b){
        return a + b;
    }

    @Deprecated
    public int calcularProduto(int a, int b){
        return a * b;
    }
} 

public class Principal {
    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();

        // Usando o método calcularSoma
        int soma = minhaClasse.calcularSoma(10, 05);
        System.out.println("Soma: " + soma);

        // Usando o método calcularProduto, que ta marcado como obsoleto
        int produto = minhaClasse.calcularProduto(10, 1);
        System.out.println("Produto: " + produto);
        // Aviso de que o método calcularProduto é obsoleto
        // Isso é apenas um aviso, o código ainda funciona
        // mas é recomendado não usar métodos obsoletos em código novo.
    }
    
}
