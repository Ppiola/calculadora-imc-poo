package br.edu.sistematizacao;

public class Pessoa extends PessoaBase implements CalculadoraIMC {

    private double peso;
    private double altura;
    private boolean ativo;

    public Pessoa(String nome, int idade, double peso, double altura) {
        super(nome, idade);
        // Usa os setters para ja aproveitar a validacao de erro na hora de criar o objeto
        setPeso(peso);
        setAltura(altura);
        this.ativo = true;
    }

    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
    public boolean isAtivo() { return ativo; }

    public void setPeso(double peso) {
        if (peso <= 0) {
            // Chama a excecao que criamos se der erro no peso
            throw new EntradaInvalidaException("O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            //Impede de adicionar altura negativa ou zerada
            throw new EntradaInvalidaException("A altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    @Override
    public double calcularIMC(double peso, double altura) {
        // Trocado para usar a recursao na altura ao quadrado
        return peso / CalculadoraRecursiva.potencia(altura, 2);
    }

    @Override
    public String classificarIMC(double imc) {
        // Tabela da OMS
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25.0) return "Normal";
        else if (imc < 30.0) return "Sobrepeso";
        else if (imc < 35.0) return "Obesidade grau I";
        else if (imc < 40.0) return "Obesidade grau II";
        else return "Obesidade grau III";
    }

    @Override
    public String exibirPerfil() {
        return String.format("Pessoa: %s | Idade: %d | Peso: %.2fkg | Altura: %.2fm",
                nome, idade, peso, altura);
    }
}