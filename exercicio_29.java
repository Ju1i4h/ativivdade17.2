package atividade17;

import java.util.Scanner;

public class exercicio_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o percentual de defeitos no lote (%): ");
        double defeitos = sc.nextDouble();
        String resultado = avaliarLote(defeitos);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String avaliarLote(double defeitos) {
        if (defeitos > 20) {
            return "Reprovado.";
        } else if (defeitos >= 10) {
            return "Enviar para retrabalho.";
        } else {
            return "Lote aprovado.";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Resultado: " + msg);
    }
}
