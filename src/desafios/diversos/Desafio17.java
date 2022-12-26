package desafios.diversos;

/*
DESAFIO 17) Usando loops
    Crie um programa que receba um número e imprima se ele é primo ou não.

    Obs: "Um número é classificado como primo se ele é maior do que um e é divisível apenas por um e por ele mesmo. Apenas números naturais são classificados como primos."
    Veja mais sobre "O que é número primo?" em: https://brasilescola.uol.com.br/o-que-e/matematica/o-que-e-numero-primo.htm
*/

import java.util.Scanner;

public class Desafio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número inteiro: ");
        int numUsuario = scan.nextInt();
        int divisores = 0;
        boolean ehPrimo = false;

        for (int i = 2; i < numUsuario; i++) {
            if (numUsuario % i == 0) {
                divisores++;
                break;
            } else {
                ehPrimo = true;
            }
        }

        System.out.printf("O número %d é primo? [%s]", numUsuario, ehPrimo);

        scan.close();
    }
}
