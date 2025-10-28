package atividade17;

import java.util.Scanner;

public class exercicio_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nível de tinta restante (%): ");
        double tinta = sc.nextDouble();
        String resultado = verificarTinta(tinta);
        mostrarResultado(resultado);
        sc.close();
    }

    public static String verificarTinta(double tinta) {
        if (tinta < 15) {
            return "Parar imediatamente!";
        } else if (tinta <= 50) {
            return "Alerta: baixo nível de tinta.";
        } else {
            return "Operação normal.";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Status: " + msg);
    }
}
