package exerciciosM2S01;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = Integer.parseInt(teclado.nextLine());
        teclado.close();

        double resto = (numero % 2);

        if ( resto == 0 ) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }

    }
}
