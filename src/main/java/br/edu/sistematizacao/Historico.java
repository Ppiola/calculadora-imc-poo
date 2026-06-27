package br.edu.sistematizacao;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    // Lista para guardar as strings dos resultados
    private List<String> registros = new ArrayList<>();

    public void adicionar(String registro) {
        registros.add(registro);
    }

    public void exibir() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum calculo no historico.");
            return;
        }

        System.out.println("\n--- Historico ---");
        for (String registro : registros) {
            System.out.println(" -> " + registro);
        }
    }
}