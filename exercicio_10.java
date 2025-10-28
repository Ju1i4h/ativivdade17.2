package atividade17;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a temperatura em graus Celsius");
        double temperatura = sc.nextDouble();
        int status = max (temperatura);
        showResult (status);

        sc.close();
    }

    public static int max(double temperatura) {
        int aux;
        if (temperatura < 0) {
            System.out.println("CONGELAMENTO DETECTADO!");
            aux = 1;
        } else if (temperatura >= 0 && temperatura <= 40) {
            System.out.println("NORMAL");
            aux = 2;
        } else {
            System.out.println("SUPERAQUECIMENTO DETECTADO!");
            aux = 3;
        }
        return aux;

        }
    public static void showResult ( double total) {
        System.out.println("temperatura=" + total);
    }
}
