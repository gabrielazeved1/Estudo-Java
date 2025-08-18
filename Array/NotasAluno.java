package Array;

public class NotasAluno {
    // Array de notas do aluno
    double[] notas = {0.0, 1.0, 2.0, 3.0, 4.0};

    public static void main(String[] args){
        NotasAluno aluno = new NotasAluno();
        for(int i = 0; i < aluno.notas.length;i++){
            System.out.println("Notas do aluno "+ (i+1) + ": " +  aluno.notas[i]);
        }
        
    }
}
