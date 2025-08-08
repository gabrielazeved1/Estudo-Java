package condicional;

public class DiasNoMes {
    String mes = "Fevereiro";
    public static void main(String[] args) {
        DiasNoMes diasNoMes = new DiasNoMes();
        switch (diasNoMes.mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> System.out.println("31 dias");
            case "Abril", "Junho", "Setembro", "Novembro" -> System.out.println("30 dias");
            case "Fevereiro" -> System.out.println("28 ou 29 dias");
            default -> System.out.println("Mês inválido");
        }
        
    }
    
}
