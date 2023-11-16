package exerciciosM2S01;

import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int[] valores = new int[10];

    System.out.println("Digite um valor inicial:");
    valores[0] = Integer.parseInt(entrada.nextLine());

    System.out.println("Digite um valor para a raiz:");
    int raiz = Integer.parseInt(entrada.nextLine());

    int tipo = 0;
    do {
      System.out.println("Digite 1 para PA ou 2 para PG:");
      tipo = Integer.parseInt(entrada.nextLine());
    } while (!(tipo == 1 || tipo == 2));

    for (int i = 1; i < valores.length; i++) {
      if (tipo == 1) {
        valores[i] = raiz + valores[i - 1];
      } else if (tipo == 2) {
        valores[i] = raiz * valores[i - 1];
      }
    }

    for (int valor : valores) {
      System.out.println(valor);
    }
  }

}


  /*

  Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora de P.A. e P.G. Peça para o
  usuário inserir um “valor inicial”, que deve ser um número inteiro. Em seguida, peça ao usuário para inserir um
  valor para a raiz. Depois, pergunte ao usuário se ele deseja calcular os 10 primeiros valores de uma P.A. ou de
  uma P.G. para os números inseridos anteriormente. Então, calcule os 10 primeiros valores de uma P.A. ou P.G.
  utilizando os números inseridos pelo usuário, e escreva essa sequência de valores na tela para o usuário
  visualizar o resultado.

  Relembrando: P.A. (Progressão Aritmética) é uma sequência numérica em que cada termo, a partir do segundo, é igual à
  soma do termo anterior com a raiz. Exemplo: Valor inicial = 1; raiz = 3; P.A. = 1, 4, 7, 10, 13, 16, 19, 22, 25, 28.

  P.G. (Progressão Geométrica) é como uma P.A., mas em vez de somar, multiplica-se a raiz. Exemplo: Valor inicial = 1;
  raiz = 3; P.G. = 1, 3, 9, 27, 81...

  */