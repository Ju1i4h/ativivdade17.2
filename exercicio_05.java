package atividade17;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de horas de uso da maquina:");
        int horasDeUso = sc.nextInt();
        String urgencia = classificarUrgencia(horasDeUso);
        mostrarResultado(urgencia);
        sc.close();
    }
    public static String classificarUrgencia(int horas) {
        if (horas < 500) {
            return "Urgência baixa";
        } else if (horas <= 1000) {
            return "Urgência média";
        } else {
            return "Urgência alta";
        }
    }
    public static void mostrarResultado(String urgencia) {
        System.out.println("Nível de manutenção: " + urgencia);
    }
}

