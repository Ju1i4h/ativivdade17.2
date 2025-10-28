package atividade17;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nível de bateria do drone (%): ");
        double bateria = sc.nextDouble();
        String rota = definirRota(bateria);
        mostrarRota(rota);
        sc.close();
    }
    public static String definirRota(double bateria) {
        if (bateria < 20) {
            return "Retorno imediato à base.";
        } else if (bateria <= 60) {
            return "Executar rota curta.";
        } else {
            return "Executar rota longa.";
        }
    }
    public static void mostrarRota(String rota) {
        System.out.println("Decisão de voo: " + rota);
    }
}





