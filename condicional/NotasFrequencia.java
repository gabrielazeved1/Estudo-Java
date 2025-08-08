package condicional;

public class NotasFrequencia {
    double nota1 = 7.0;
    double nota2 = 9.0;
    double frequencia = 70.0;
    public static void main(String[] args) {
        NotasFrequencia nt = new NotasFrequencia();
        double media = (nt.nota1 + nt.nota2) / 2;
        if (media >= 6.0 && nt.frequencia >= 75.0) {
            System.out.println ( "Aluno Aprovado: " + media + "% frequencia: " + nt.frequencia);
        }
        else{
            System.out.println("Aluno Reprovado: " + media + "% frequencia: " + nt.frequencia);

        }
        }
}
