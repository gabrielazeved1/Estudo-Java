package POO;
import POO.SalaDeAula;
public class TesteSalaDeAula {
    public static void main(String[] args){
        SalaDeAula sala1 = new SalaDeAula();

        SalaDeAula.contagemAlunos(); // Incrementa o número de alunos
        SalaDeAula.contagemAlunos(); // Incrementa novamente o número de alunos
        SalaDeAula.contagemAlunos(); // Incrementa mais uma vez o número de alunos

        SalaDeAula.exibeAlunos(); // Exibe o número de alunos após as contagens
    }
}
