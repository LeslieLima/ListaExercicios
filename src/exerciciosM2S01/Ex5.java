package exerciciosM2S01;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe 3 notas do semestre");
        System.out.print("Informe a nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Informe a nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Informe a nota 3: ");
        double nota3 = teclado.nextDouble();

        teclado.close();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média final é: %.2f", media);
    }
}
