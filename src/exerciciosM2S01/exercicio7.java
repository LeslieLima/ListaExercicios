package exerciciosM2S01;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Infome o primeiro número da operação: ");
        double numero1 = Double.parseDouble(teclado.nextLine());

        System.out.print("Infome a operação desejada: ");
        String operacao = teclado.nextLine();

        System.out.print("Infome o segundo número da operação: ");
        double numero2 = Double.parseDouble(teclado.nextLine());

        teclado.close();

        double resultado = getCalculo(numero1, numero2, operacao);
        System.out.printf("A operação: %.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);

    }

    public static double getCalculo(Double n1, Double n2, String op) {
        switch (op) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 != 0) {
                    return n1 / n2;
                }
                break;
        }
        return 0;
    }

}
