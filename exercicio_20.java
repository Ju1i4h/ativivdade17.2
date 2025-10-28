package atividade17;

import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora atual (0 a 23): ");
        int hora = sc.nextInt();
        String turno = definirTurno(hora);
        mostrarResultado(turno);
        sc.close();
    }
    public static String definirTurno(int hora) {
        if (hora < 12) {
            return "Manhã";
        } else if (hora < 18) {
            return "Tarde";
        } else {
            return "Noite";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Turno atual: " + msg);
    }
}
