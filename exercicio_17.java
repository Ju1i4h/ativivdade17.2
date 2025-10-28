package atividade17;

import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Robô A falhou? (true/false): ");
        boolean roboA = sc.nextBoolean();
        System.out.print("Robô B falhou? (true/false): ");
        boolean roboB = sc.nextBoolean();
        String resultado = verificarFalhas(roboA, roboB);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String verificarFalhas(boolean a, boolean b) {
        if (a && b) {
            return "Parar a linha de produção.";
        } else if (a) {
            return "Acionar robô B.";
        } else {
            return "Sistema funcionando normalmente.";
        }
    }
    public static void mostrarResultado(String mensagem) {
        System.out.println("Resultado: " + mensagem);
    }
}
