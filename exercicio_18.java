package atividade17;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a porcentagem de energia solar disponível: ");
        double energiaSolar = sc.nextDouble();
        String resultado = escolherFonteEnergia(energiaSolar);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String escolherFonteEnergia(double energia) {
        if (energia > 70) {
            return "Usar energia solar.";
        } else if (energia >= 30) {
            return "Usar sistema híbrido.";
        } else {
            return "Usar energia da rede elétrica.";
        }
    }
    public static void mostrarResultado(String mensagem) {
        System.out.println("Fonte de energia: " + mensagem);
    }
}