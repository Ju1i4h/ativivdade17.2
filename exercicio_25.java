package atividade17;

import java.util.Scanner;

public class exercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a intensidade elétrica (A): ");
        int corrente = sc.nextInt();
        String resultado = classificarIntensidade(corrente);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String classificarIntensidade(int corrente) {
        if (corrente < 100) {
            return "Intensidade fraca.";
        } else if (corrente <= 200) {
            return "Intensidade média.";
        } else {
            return "Intensidade forte.";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Classificação: " + msg);
    }
}
