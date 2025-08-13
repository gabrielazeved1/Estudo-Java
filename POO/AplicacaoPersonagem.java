package POO;
public class AplicacaoPersonagem {
    public static void main(String[] args){
        Personagem personagem = new Personagem("Goku", 9000);
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Nível de Poder: " + personagem.getNivelDePoder());

        System.out.println("=========================================================");
        personagem.setNome("Vegeta");
        personagem.setNivelDePoder(8500);
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Nível de Poder: " + personagem.getNivelDePoder());
        System.out.println("=========================================================");
        personagem.tentarAumentarNivelDePoder();
        System.out.println("Nível de Poder após tentativa de aumento: " + personagem.getNivelDePoder());
    }
}
