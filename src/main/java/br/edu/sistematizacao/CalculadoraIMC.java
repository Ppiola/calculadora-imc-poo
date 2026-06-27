package br.edu.sistematizacao;

public interface CalculadoraIMC {
    // Calcula o valor numerico do IMC
    double calcularIMC(double peso, double altura);

    // Retorna a classificacao textual (ex: Normal, Sobrepeso)
    String classificarIMC(double imc);
}