package condicional;

public class VerificadorMes {
    public static void main (String[] args){
        int mes = 4;
        
        switch (mes) {
            case 1 -> System.out.println("Janeiro");
                
            case 2 -> System.out.println("Fevereiro");
                
            case 3 -> System.out.println("Março");
               
            case 4 -> System.out.println("Abril");
                
            case 5 -> System.out.println("Maio");
                
            case 6 -> System.out.println("Junho");
                
            default -> System.out.println("Mês inválido");
            
        }
    
    }
}
