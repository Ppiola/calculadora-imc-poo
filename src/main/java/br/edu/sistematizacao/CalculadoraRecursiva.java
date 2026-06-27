package br.edu.sistematizacao;

public class CalculadoraRecursiva {

    // Metodo pra calcular a potencia usando recursao, como pedido nas regras
    public static double potencia(double base, int expoente) {
        // condicao de parada
        if (expoente == 0) {
            return 1.0;
        }
        return base * potencia(base, expoente - 1);
    }
}