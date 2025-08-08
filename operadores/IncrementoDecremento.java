package operadores;

public class IncrementoDecremento {
    int contador = 5;
    
    

    public static void main( String[] args){
        IncrementoDecremento incrementoDecremento = new IncrementoDecremento();
        System.out.println(incrementoDecremento.contador);
        System.out.println(++incrementoDecremento.contador);
        System.out.println(--incrementoDecremento.contador);



    }
}
