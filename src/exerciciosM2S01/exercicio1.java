package exerciciosM2S01;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        teclado.close();

        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);
    }
}
