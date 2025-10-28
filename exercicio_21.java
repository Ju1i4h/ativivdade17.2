package atividade17;

import java.util.Scanner;

public class exercicio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso da carga (kg): ");
        double carga = sc.nextDouble();
        String resultado = verificarCarga(carga);
        mostrarResultado(resultado);
        sc.close();
    }

    public static String verificarCarga(double peso) {
        if (peso < 500) {
            return "Carga permitida.";
        } else if (peso <= 1000) {
            return "Alerta: carga próxima do limite.";
        } else {
            return "Proibido: carga excedente!";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Situação: " + msg);
    }
}