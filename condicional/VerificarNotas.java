package condicional;

public class VerificarNotas {
    double nota1 = 7.0;
    double nota2 = 4.0;
    public static void main(String[] args) {
        VerificarNotas vn = new VerificarNotas();
        double media = (vn.nota1 + vn.nota2) / 2;
        if (media >= 6.0) {
            System.out.println ( "Aluno Aprovado: " + media);
        }
        else{
            System.out.println("Aluno Reprovado: " + media);

        }
        }

    }

