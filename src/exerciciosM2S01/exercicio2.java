package exerciciosM2S01;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a sua altura (duas casas decimais): ");
        double altura = teclado.nextDouble();

        System.out.println("Informe o seu peso (duas casas decimais): ");
        double peso = teclado.nextDouble();

        teclado.close();

        double imc = peso / (altura*altura);
        System.out.printf("IMC calculado: %.2f", imc);
    }
}
