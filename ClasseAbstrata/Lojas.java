package ClasseAbstrata;

abstract class Loja {
    // atributos
    private String cnpj;
    private String razaoSocial;
    protected boolean aberta;

    // construtor
    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    // método para abrir a loja
    public void abrir() {
        this.aberta = true;
    }

    // método para fechar a loja
    public void fechar() {
        this.aberta = false;
    }

    // getter
    public boolean isAberta() {
        return aberta;
    }
}

// classe concreta
class LojaComercial extends Loja {
    public LojaComercial(String cnpj, String razaoSocial) {
        super(cnpj, razaoSocial);
    }
}

// exemplo de uso
public class Lojas {
    public static void main(String[] args) {
        LojaComercial minhaLoja = new LojaComercial("123456789", "Minha Loja");
        
        minhaLoja.abrir();
        System.out.println("A loja está aberta? " + minhaLoja.isAberta());

        System.out.println("=======================================================================");

        minhaLoja.fechar();
        System.out.println("A loja está aberta? " + minhaLoja.isAberta());
    }
}
