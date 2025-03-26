/*
 * Autor: Róger
 * Descrição: Este programa recebe dois números inteiros via terminal.
 * Se o primeiro for menor que o segundo, ele imprime uma sequência de números.
 * Caso contrário, lança uma exceção personalizada informando que o segundo número deve ser maior.
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();

        try {

            contar(n1, n2);

        } catch (ParametroInvalidoException exp) {
            System.out.println(exp.getMessage());
        }


    }

    static void contar(int n1, int n2) throws ParametroInvalidoException {

        if (n1 >= n2) {
            throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
        }

        int count = n2 - n1;

        for (int i = 0; i < count; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }

    }
}