package POO;

public class Personagem {
    private String nome ;
    private int nivelDePoder;

    public Personagem(String nome, int nivelDePoder){
        this.nome = nome ;
        this.nivelDePoder = nivelDePoder;
    }
    public void tentarAumentarNivelDePoder(){
        nivelDePoder += 10;

    }

    // Getter para o nome
    public void  setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    // Getter para o NivelPoder
    // os setters geralmente usam void 
    public void  setNivelDePoder(int nivelDePoder){
        this.nivelDePoder = nivelDePoder;
    }
    public int getNivelDePoder(){
        return nivelDePoder;
    }
    


}
