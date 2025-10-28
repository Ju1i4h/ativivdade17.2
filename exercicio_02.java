package atividade17;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class VerificadorEstadoPecaMetodo
        {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o código da peça (1:Aprovado, 2:Reprovado, 3:Retrabalho, 4:Análise Manual):");
                int codigo = sc.nextInt();
                String estadoPeca = determinarEstado(codigo);
                System.out.println("O estado da peça é: " + estadoPeca);
                sc.close();
            }
            public static String determinarEstado(int codigo) {
                if (codigo == 1) {
                    return "Aprovado";
                } else if (codigo == 2) {
                    return "Reprovado";
                } else if (codigo == 3) {
                    return "Retrabalho";
                } else if (codigo == 4) {
                    return "Análise Manual";
                } else {
                    return "Código Inválido";
                }
            }
        }
    }
}