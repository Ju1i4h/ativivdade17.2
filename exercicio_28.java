package atividade17;

import java.util.Scanner;

public class exercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Estrada bloqueada? (true/false): ");
        boolean bloqueio = sc.nextBoolean();
        System.out.print("Trânsito alto? (true/false): ");
        boolean transito = sc.nextBoolean();
        String resultado = definirRota(bloqueio, transito);
        mostrarResultado(resultado);
        sc.close();
    }

    public static String definirRota(boolean bloqueio, boolean transito) {
        if (bloqueio) {
            return "Recalcular rota.";
        } else if (transito) {
            return "Usar rota alternativa.";
        } else {
            return "Seguir trajeto normal.";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Decisão: " + msg);
    }
}
