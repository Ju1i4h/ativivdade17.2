package atividade17;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura da máquina (°C): ");
        double temperatura = sc.nextDouble();
        System.out.print("Nível de vibração (%): ");
        double vibracao = sc.nextDouble();
        String acao = verificarSeguranca(temperatura, vibracao);
        mostrarAcao(acao);
        sc.close();
    }
    public static String verificarSeguranca(double temperatura, double vibracao) {
        if (temperatura > 90 || vibracao > 80) {
            return "Emergência! Desligar a máquina imediatamente!";
        } else {
            return "Condições normais de operação.";
        }
    }
    public static void mostrarAcao(String acao) {
        System.out.println("Status: " + acao);
    }
}
