package atividade17;

import java.util.Scanner;

public class exercicio_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o índice de partículas no ar: ");
        int indice = sc.nextInt();
        String classificacao = classificarQualidade(indice);
        mostrarResultado(classificacao);
        sc.close();
    }
    public static String classificarQualidade(int indice) {
        if (indice < 50) {
            return "Bom";
        } else if (indice < 100) {
            return "Moderado";
        } else if (indice < 200) {
            return "Ruim";
        } else {
            return "Crítico";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Qualidade do ar: " + msg);
    }
}
