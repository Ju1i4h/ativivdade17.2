package atividade17;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nível de energia (%): ");
        double energia = sc.nextDouble();
        String modo = verificarModo(energia);
        mostrarResultado(modo);

        sc.close();
    }

    public static String verificarModo(double energia) {
        if (energia < 30) {
            return "Modo Econômico";
        } else if (energia <= 70) {
            return "Modo Normal";
        } else {
            return "Modo Turbo";
        }
    }
    public static void mostrarResultado(String modo) {
        System.out.println("A máquina está em: " + modo);
    }
}

