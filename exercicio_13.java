package atividade17;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Produção por hora (número de peças): ");
        int producao = sc.nextInt();
        String desempenho = avaliarDesempenho(producao);
        mostrarResultado(desempenho);
        sc.close();
    }
    public static String avaliarDesempenho(int producao) {
        if (producao < 50) {
            return "Baixo desempenho";
        } else if (producao <= 100) {
            return "Desempenho regular";
        } else {
            return "Desempenho ótimo";
        }
    }
    public static void mostrarResultado(String desempenho) {
        System.out.println("Classificação: " + desempenho);
    }
}

