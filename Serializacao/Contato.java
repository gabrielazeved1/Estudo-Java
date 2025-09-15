package Serializacao;

import java.io.Serializable;

public class Contato implements Serializable {
    private static final long serialVersionUID = 1L;

    public String nome;
    public String telefone;

    public Contato(String initNome, String initTelefone) {
        this.nome = initNome;
        this.telefone = initTelefone;
    }
}
