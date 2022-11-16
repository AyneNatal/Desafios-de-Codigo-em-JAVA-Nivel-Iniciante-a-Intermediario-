package desafios.diversos;

/*

DESAFIO 5)
Crie um Vetor com 5 elementos inteiros e faça um programa que imprima a tabuada de cada um dos elementos desse vetor.

*/

import java.util.Arrays;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Entre com um número para saber sua tabuada: ");
            vetor[i] = scan.nextInt();
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", vetor[i], j, (vetor[i] * j));
            }
        }

        System.out.println("vetor = " + Arrays.toString(vetor));
    }
}
