package br.edu.sistematizacao;

public class SistemaIMC {

    // Composicao: o sistema "tem um" historico interno
    private Historico historico = new Historico();

    public void processar(Pessoa pessoa) {
        double imc = pessoa.calcularIMC(pessoa.getPeso(), pessoa.getAltura());

        // Polimorfismo: o Java chama o classificarIMC de Pessoa ou Atleta dependendo do objeto
        String classificacao = pessoa.classificarIMC(imc);

        String resultado = String.format("%s -> IMC: %.2f (%s)", pessoa.getNome(), imc, classificacao);

        historico.adicionar(resultado);
        System.out.println(resultado);
    }

    public void exibirHistorico() {
        historico.exibir();
    }
}