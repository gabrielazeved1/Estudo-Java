package POO;

public class SalaDeAula {
    static int numeroDeAlunos = 10;
    
    public static void contagemAlunos(){
        numeroDeAlunos++;
    }
    public static void exibeAlunos(){
        System.out.println("Número de alunos: " + numeroDeAlunos);
    }
}
