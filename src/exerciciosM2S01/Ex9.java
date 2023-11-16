package exerciciosM2S01;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Infome o salário: ");
        double salario = Double.parseDouble(teclado.nextLine());
        teclado.close();

        double percertualAplicado = 0;
        double valorAumento = 0;
        double novoSalario = 0;

        if (salario <= 1200) {
            percertualAplicado = 0.20;
        } else if ((salario > 1200) && (salario <= 1700)) {
                percertualAplicado = 0.15;
            } else if ((salario > 1700) && (salario < 2500)) {
                    percertualAplicado = 0.10;
                } else if (salario >= 2500)  {
                    percertualAplicado = 0.05;
                }

        valorAumento = salario * percertualAplicado;
        novoSalario = salario + valorAumento;

        System.out.println("O salário antes do reajuste: " + salario);
        System.out.println("O percentual de aumento aplicado: " + percertualAplicado * 100 + "%");
        System.out.println("O valor do aumento: " + valorAumento);
        System.out.println("O novo salário, após o aumento: " + novoSalario);

    }

}
