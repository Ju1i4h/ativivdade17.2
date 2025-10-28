package atividade17;

import java.util.Scanner;

public class exercicio_09 {
    public static class exrcicio_09 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o indice de defeitos no lote(%):");
            double defeitos = sc.nextDouble();
            String resultado = verificarLote(defeitos);
            mostrarResultado(resultado);
            sc.close();
        }

        public static String verificarLote(double defeitos) {
            if (defeitos > 10) {
                return ("Alerta: índice de defeitos acima do permitido!");
            } else {
                return ("Lote aprovado.");
            }
        }
        public static void mostrarResultado (String resultado){
            System.out.println(resultado);
        }
    }
}

