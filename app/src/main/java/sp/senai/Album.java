package sp.senai;

import androidx.annotation.NonNull;

public class Album {
    private int id;
    private String nome;
    private String ano;
    private String banda;

    // Método construtor
    public Album(String nome, String ano, String banda) {
        /**this.nome = nome;
        this.ano = ano;
        this.banda = banda;**/
        setNome(nome);
        setAno(ano);
        setBanda(banda);
    }

    // Construtor vazio
    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return nome;
    }
}
