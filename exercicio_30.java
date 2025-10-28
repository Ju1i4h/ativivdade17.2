package atividade17;

import java.util.Scanner;

public class exercicio_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura do servidor (°C): ");
        double temperatura = sc.nextDouble();
        String resultado = monitorarTemperatura(temperatura);
        mostrarResultado(resultado);
        sc.close();
    }
    public static String monitorarTemperatura(double temp) {
        if (temp > 80) {
            return "Desligar servidores!";
        } else if (temp >= 60) {
            return "Ativar resfriamento extra.";
        } else {
            return "Temperatura normal.";
        }
    }
    public static void mostrarResultado(String msg) {
        System.out.println("Status: " + msg);
    }
}
