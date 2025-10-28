package atividade17;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso do pacote (kg): ");
        double peso = sc.nextDouble();
        String classificacao = classificarPeso(peso);
        mostrarClassificacao(classificacao);
        sc.close();
    }
    public static String classificarPeso(double peso) {
        if (peso < 10) {
            return "Leve";
        } else if (peso <= 30) {
            return "Médio";
        } else if (peso <= 60) {
            return "Pesado";
        } else {
            return "Muito pesado";
        }
    }
    public static void mostrarClassificacao(String classificacao) {
        System.out.println("Classificação do pacote: " + classificacao);
    }
}
