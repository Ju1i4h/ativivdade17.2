package atividade17;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" digite restante de filamento em porcentagem");
        int porcentagem = sc.nextInt();
        int restante = max (porcentagem);
        showResult (restante);
        sc.close();
    }
       public static int max (int porcentagem){
        int aux;
        if (porcentagem < 20) {
            System.out.println(" Troque o material!");
            aux=1;
        } else {
            System.out.println("Continue a impressão.");
            aux=2;
        }
        return  aux;
    }
    public static void showResult(int total) {
        System.out.println("restante= " + total);
    }}


