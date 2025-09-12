package Exception;

public class ExemploNullPointerExceptionInteger {
    public static void main(String[] args){
        try {
            Integer numero = null;
            System.out.println(numero.toString()); // tentativa de transformar uma variavel nula (integer) em string
        }
        catch (NullPointerException e) {
            System.out.println("Ocorreu um NullPointerException: " + e.getMessage());
        }
        finally{
            System.out.println("ola");
        }
    }
}
 