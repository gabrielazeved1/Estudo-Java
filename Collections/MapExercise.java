package Collections;
import java.util.HashMap;
import java.util.Map;


public class MapExercise {
    public static void main (String[] args){
        // incializar conjunto -> estoque -> dicionario
        Map<Integer,Integer> estoque = new HashMap<>();

        // adicionar produtos ao estoque
        estoque.put(123,50);
        estoque.put(456,30);
        estoque.put(789,20);

        //verificar quantidade disponivel de um produto 
        int codigoProduto = 123;
        int quantidadeProduto = estoque.get(codigoProduto);

        // printar quantidade de produto 
        System.out.println("Quantidade de prpduto" + codigoProduto + ": "+ quantidadeProduto);
        System.out.println("========================================================");


        // remover alguns produtos do estoque -> tratar erros
        int quantidadeRemovida = 10;
        if (quantidadeProduto > quantidadeRemovida) {
            estoque.put(codigoProduto, quantidadeProduto - quantidadeRemovida);
            

            System.out.println("Quantidade de produto" + codigoProduto + "apos remocao: "+ (quantidadeProduto - quantidadeRemovida));

            System.out.println("=======================verificar logica==============");
            
            System.out.println("Quantidade de produto" + codigoProduto + "apos remocao: "+ (quantidadeProduto ));
        }
        else{
            System.out.println("Quantidade insuficiente para remover.");
        }
    }
    
}
