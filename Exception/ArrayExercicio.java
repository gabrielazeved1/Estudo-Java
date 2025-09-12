package Exception;

public class ArrayExercicio {
    // metodo para acessar array
    public static int acessarElemento(int[] array, int indice) {
        try{
            return array[indice];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Indice fora dos limites do array.");
            return -1;
        }
    }

    public static void main(String[] args){
        //declarar e inicializar um array de inteiros
        int[] meuArray = {10, 20, 30, 40, 50};
        
        System.out.println("Elemento no indice 2: " + acessarElemento(meuArray, 2));

        System.out.println("=================================================================" );
        
        // teste com indice invalido
        System.out.println("Elemento no indice 2: " + acessarElemento(meuArray, 10));

    }


}
