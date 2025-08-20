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

class ExemploDeprecado{
    
    @Deprecated
    public void metodoAntigo(){
        System.out.println("Este método é antigo e não deve ser usado.");
    }    
}

public class Principal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();

        // Usando o método calcularSoma
        int soma = minhaClasse.calcularSoma(10, 05);
        System.out.println("Soma: " + soma);

        // Usando o método calcularProduto, que ta marcado como obsoleto
        int produto = minhaClasse.calcularProduto(10, 1);
        System.out.println("Produto: " + produto);

        System.out.println("======================================" );

        ExemploDeprecado exemplo = new ExemploDeprecado();
        exemplo.metodoAntigo();


    }
    
}
