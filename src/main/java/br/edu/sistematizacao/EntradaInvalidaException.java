package br.edu.sistematizacao;

// Excecao customizada exigida no trabalho
public class EntradaInvalidaException extends RuntimeException {

    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}