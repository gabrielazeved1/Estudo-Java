package Loops;

public class ContagemDeDoces {
    int comidos =1;
    public static void main (String[] args){
        ContagemDeDoces contagem = new ContagemDeDoces();
        while(contagem.comidos < 4){
            System.out.println("Doces comidos: "+ contagem.comidos);
            contagem.comidos++;
        }
    }
}
