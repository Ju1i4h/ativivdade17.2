package atividade17;

import java.util.Scanner;

public class exercicio_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tipo de erro (1 = crítico, 2 = moderado, 3 = nenhum): ");
        int erro = sc.nextInt();
        String resultado = verificarErro(erro);
        mostrarResultado(resultado);
        sc.close();
    }

    public static String verificarErro(int erro) {
        if (erro == 1) {
            return "Parar a linha de produção!";
        } else if (erro == 2) {
            return "Acionar manutenção.";
        } else {
            return "Produção normal.";
        }
    }

    public static void mostrarResultado(String msg) {
        System.out.println("Status: " + msg);
    }
}
