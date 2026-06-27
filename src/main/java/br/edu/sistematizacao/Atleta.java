package br.edu.sistematizacao;

public class Atleta extends Pessoa {

    private String modalidade;

    public Atleta(String nome, int idade, double peso, double altura, String modalidade) {
        // Repassa os dados para o construtor da classe Pessoa
        super(nome, idade, peso, altura);
        this.modalidade = modalidade;
    }

    @Override
    public String classificarIMC(double imc) {
        // Regra de IMC especifica para atletas
        if (imc < 20.0) {
            return "Abaixo do ideal para atleta";
        } else if (imc <= 27.0) {
            return "Ideal para atleta";
        } else {
            return "Acima do ideal para atleta";
        }
    }

    @Override
    public String exibirPerfil() {
        // Reutiliza o texto da classe mae e adiciona a modalidade
        return super.exibirPerfil() + " | Modalidade: " + modalidade;
    }
}