package atividade17;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe seu cargo(operador,supervisor,engenheiro):");
        String cargo = sc.nextLine().toLowerCase();
        String permissao = verificarAcesso(cargo);
        mostrarPermissao(permissao);
        sc.close();
    }
    public static String verificarAcesso(String cargo) {
        if (cargo.equals("operador")) {
            return "Acesso restrito";
        } else if (cargo.equals("supervisor")) {
            return "Acesso parcial";
        } else if (cargo.equals("engenheiro")) {
            return "Acesso total";
        } else {
            return "Cargo inválido ou não reconhecido";
        }
    }
    public static void mostrarPermissao(String permissao) {
        System.out.println("Permissão concedida: " + permissao);
    }
}

