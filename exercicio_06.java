package atividade17;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância do obstáculo (em metros): ");
        double distancia = sc.nextDouble();

        String acao = decidirAcao(distancia);
        mostrarAcao(acao);

        sc.close();
    }
    public static String decidirAcao(double distancia) {
        if (distancia < 5) {
            return "Frear imediatamente!";
        } else if (distancia <= 15) {
            return "Reduzir velocidade.";
        } else {
            return "Acelerar – caminho livre.";
        }
    }
    public static void mostrarAcao(String acao) {
        System.out.println("Ação do veículo: " + acao);
    }
}