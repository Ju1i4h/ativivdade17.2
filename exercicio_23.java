package atividade17;

import java.util.Scanner;

public class exercicio_23 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite a porcentagem de tráfego suspeito: ");
        double trafego = sc.nextDouble();
        String resultado = analisarRede(trafego);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String analisarRede(double trafego) {
        if (trafego > 70) {
            return "Bloquear acesso!";
        } else if (trafego >= 30) {
            return "Emitir alerta de segurança.";
        } else {
            return "Rede normal.";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Status da rede: " + msg);
    }
}
