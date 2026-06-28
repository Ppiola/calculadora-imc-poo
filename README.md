# Projeto: Calculadora de IMC (POO)
**Aluno:** Pedro de Moura Magalhães Piola
**Matrícula/RA:** 72600908
**Curso/Turma:** ADS / Turma B - 0426

Projeto desenvolvido como sistematização da disciplina de Programação Orientada a Objetos.

## Requisitos atendidos

- **Abstração** — Classe abstrata `PessoaBase`
- **Encapsulamento** — Atributos privados com validação nos setters
- **Herança** — `Pessoa extends PessoaBase` e `Atleta extends Pessoa`
- **Polimorfismo** — `classificarIMC()` sobrescrito em `Atleta`
- **Interface** — `CalculadoraIMC` implementada por `Pessoa`
- **Recursividade** — `CalculadoraRecursiva.potencia()` para cálculo da altura²
- **Exceção customizada** — `EntradaInvalidaException`
- **Coleções** — `ArrayList` no `Historico`
- **Menu interativo** — Scanner com loop `do-while` e tratamento de erros

## Como executar

Pré-requisito: Java 11+ e Maven instalados.

```bash
mvn compile exec:java -Dexec.mainClass="br.edu.sistematizacao.Main"
```
