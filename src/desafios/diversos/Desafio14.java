package desafios.diversos;

/*

DESAFIO 14) Trabalhando com vetores (arrays)

Criar um vetor A com 10 números inteiros aleatórios de 1 a 30. Escrever um programa que calcule e imprima no console:
    1. a soma dos elementos armazenados neste vetor que são superiores a 10;
    2. a soma dos elementos armazenados neste vetor que são inferiores a 10;

*/

import java.util.Arrays;
import java.util.Random;

public class Desafio14 {
    public static void main(String[] args) {
        Random rdn = new Random();
        int[] vetorA = new int[10];

        int somaSuperioresA10 = 0;
        int somaInferioresA10 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rdn.nextInt(30) + 1;

            if (vetorA[i] > 10){
                somaSuperioresA10 += vetorA[i];
            }
            else if (vetorA[i] < 10){
                somaInferioresA10 += vetorA[i];
            }
        }

        System.out.printf("Vetor gerado: %s%n", Arrays.toString(vetorA));

        //1. a soma dos elementos armazenados neste vetor que são superiores a 10:
        System.out.printf("Soma dos nums superiores a 10: %d%n", somaSuperioresA10);

        //2. a soma dos elementos armazenados neste vetor que são inferiores a 10:
        System.out.printf("Soma dos nums inferiores a 10: %d%n", somaInferioresA10);
    }
}
