package exerciciosM2S01;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int numero = Integer.parseInt(teclado.nextLine());
        teclado.close();

        int rand = (int) (Math.random() * (5-1) + 1);

        if (numero == rand) {
            System.out.print("Você acertou!");
        } else {
            System.out.print("Você errou, o número correto era " + rand);
        }
    }
}
