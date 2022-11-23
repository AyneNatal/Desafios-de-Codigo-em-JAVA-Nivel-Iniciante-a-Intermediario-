package desafios.diversos;

/*
DESAFIO 9)
Trabalhando com matrizes:
    1. Gere e imprima uma Matriz M 7x7 com valores aleatórios entre 0 e 100.
    2. Após isso indique qual é o maior valor da linha 5 e qual é o menor valor da coluna 1.
    OBS: lembre que a contagem numa matriz ou array começa do zero.
*/

import java.util.Arrays;
import java.util.Random;

public class Desafio9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[7][7];

        int maiorValorLinha5 = 0;
        int menorValorColuna1 = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
                if (matriz[5][j] > maiorValorLinha5) maiorValorLinha5 = matriz[5][j];
            }
            if (matriz[i][1] < menorValorColuna1) menorValorColuna1 = matriz[i][1];
        }

        System.out.println("Matriz: " + Arrays.deepToString(matriz));
        System.out.println("Maior valor da linha 5 = " + maiorValorLinha5);
        System.out.println("Menor valor da coluna 1 = " + menorValorColuna1);
    }
}
