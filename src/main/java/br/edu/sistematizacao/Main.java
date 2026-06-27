package br.edu.sistematizacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Instancia o nosso sistema (que tem a composicao do historico)
        SistemaIMC sistema = new SistemaIMC();
        int opcao = 0;

        System.out.println("=== Bem-vindo a Calculadora de IMC ===");

        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1 - Calcular IMC de Pessoa");
            System.out.println("2 - Calcular IMC de Atleta");
            System.out.println("3 - Exibir Historico");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o "enter" do teclado

                if (opcao == 1) {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();

                    // Cria a pessoa. Se peso/altura <= 0, lanca a excecao
                    Pessoa p = new Pessoa(nome, idade, peso, altura);
                    sistema.processar(p);

                } else if (opcao == 2) {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o enter antes de ler texto de novo
                    System.out.print("Modalidade Esportiva: ");
                    String modalidade = scanner.nextLine();

                    // Cria o atleta passando a modalidade
                    Atleta a = new Atleta(nome, idade, peso, altura, modalidade);
                    sistema.processar(a);

                } else if (opcao == 3) {
                    sistema.exibirHistorico();

                } else if (opcao == 4) {
                    System.out.println("Encerrando o programa...");
                } else {
                    System.out.println("Opcao invalida. Tente novamente.");
                }

            } catch (EntradaInvalidaException e) {
                // Captura a excecao (peso ou altura invalida)
                System.out.println("\nErro de validacao: " + e.getMessage());

            } catch (InputMismatchException e) {
                // Captura se o usuario digitar letra onde deveria ser numero
                System.out.println("\nErro: Voce digitou um valor invalido. Lembre-se de usar virgula para decimais.");
                scanner.nextLine(); // Limpa a sujeira do scanner pra nao dar loop infinito

            } catch (Exception e) {
                // Pega qualquer outro erro inesperado pra nao fechar o app na cara do usuario
                System.out.println("\nOcorreu um erro inesperado: " + e.getMessage());
            }

        } while (opcao != 4);

        scanner.close();
    }
}