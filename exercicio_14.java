package atividade17;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de itens detectados na esteira:");
        int numeroDeItens = sc.nextInt();

        int status = max(numeroDeItens);
        showResult(status);
        sc.close();
    }

    public static int max(int numeroDeItens) {
        int aux;

        if (numeroDeItens <= 10) {
            System.out.println("Velocidade: Lenta");
            aux = 1;
        } else if (numeroDeItens <= 50) {
            System.out.println("Velocidade: Média");
            aux = 2;
        } else {
            System.out.println("Velocidade: Rápida");
            aux = 3;
        }

        return aux;
    }

    public static void showResult(int status) {
        System.out.println("Código de velocidade = " + status);
    }
}





