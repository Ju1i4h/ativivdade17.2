package atividade17;

import java.util.Scanner;

public class exercicio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos em estoque: ");
        int quantidade = sc.nextInt();
        String resultado = verificarEstoque(quantidade);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String verificarEstoque(int qtd) {
        if (qtd < 10) {
            return "Reabastecimento urgente!";
        } else if (qtd <= 30) {
            return "Alerta: estoque baixo.";
        } else {
            return "Estoque normal.";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Status do estoque: " + msg);
    }
}
