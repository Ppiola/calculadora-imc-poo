package br.edu.sistematizacao;

public abstract class PessoaBase {
    protected String nome;
    protected int idade;

    public PessoaBase(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Forca as classes filhas a criarem este metodo
    public abstract String exibirPerfil();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
