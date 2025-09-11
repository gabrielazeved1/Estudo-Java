package Collections;
import java.util.ArrayList;
import java.util.List;


public class ListExercise {
    public static void main (String[] args){
        // incializacao da collection
        List<String> filmes = new ArrayList<>();

        //adicionar filmes a lista
        filmes.add("O poderoso chefao");
        filmes.add("Matrix");
        filmes.add("Velozes e Furiosos");

        //imprime a lista de filmes 
        System.out.println("A lista de filmes é: ");
        for (String filme : filmes){
            System.out.println(filme);
        }

        //verifica se um filme especifico esta na lsta
        String filmeEspecifico = "Matrix";
        if (filmes.contains(filmeEspecifico)){
            System.out.println(filmeEspecifico + " esta na lista.");
        }
        else{
            System.out.println(filmeEspecifico + " nao esta na lista");
        }
    }
}
