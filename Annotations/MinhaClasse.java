package Annotations;

class SuperClasse {
    public void imprime(){
        System.out.println("Imprimindo da SuperClasse");
    }
}

public class MinhaClasse extends SuperClasse {

    @Override
    public void imprime() {
        System.out.println("Imprimindo da MinhaClasse");
    }

    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.imprime(); // Chama o método sobrescrito
    }
    
}
