package atividade17;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean crachaValido, capaceteSeguranca, horarioTurno;
        System.out.print("Crachá válido? (true/false): ");
        crachaValido = sc.nextBoolean();

        System.out.print("Capacete de segurança em uso? (true/false): ");
        capaceteSeguranca = sc.nextBoolean();

        System.out.print("Está no horário de turno? (true/false): ");
        horarioTurno = sc.nextBoolean();
        int status = max(crachaValido, capaceteSeguranca, horarioTurno);
        showResult(status);

        sc.close();
    }

    public static int max(boolean cracha, boolean capacete, boolean turno) {
        int aux;
        if (cracha && capacete && turno) {
            System.out.println("ACESSO PERMITIDO");
            aux = 1;
        } else {
            System.out.println("ACESSO NEGADO!");
           aux = 0;
        }
        return aux;
    }

    public static void showResult(int status) {
        System.out.println("Status final = " + status);
    }
}
