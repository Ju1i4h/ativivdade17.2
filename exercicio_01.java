package atividade17;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sensor frontal (true=1 / false=0): ");
        boolean frontal = sc.nextBoolean();
        System.out.print("Sensor direita (true=1 / false=0): ");
        boolean direita = sc.nextBoolean();
        System.out.print("Sensor esquerda (true=1 / false=0): ");
        boolean esquerda = sc.nextBoolean();
        String acao = decidirMovimento(frontal, direita, esquerda);
        mostrarAcao(acao);

        sc.close();
    }
    public static String decidirMovimento(boolean frontal, boolean direita, boolean esquerda) {
        if (!frontal) {
            return "Seguir em frente";
        } else if (direita) {
            return "Desviar para a direita";
        } else if (esquerda) {
            return "Desviar para a esquerda";
        } else {
            return "Parar – obstáculos em todas as direções";
        }
    }
    public static void mostrarAcao(String acao) {
        System.out.println("Ação do robô: " + acao);
    }
}