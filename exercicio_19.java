package atividade17;

import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do pH: ");
        double ph = sc.nextDouble();
        String resultado = classificarPH(ph);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String classificarPH(double ph) {
        if (ph < 7) {
            return "Solução ácida.";
        } else if (ph == 7) {
            return "Solução neutra.";
        } else {
            return "Solução básica.";
        }
    }
    public static void mostrarResultado(String mensagem) {
        System.out.println("Classificação: " + mensagem);
    }
}
