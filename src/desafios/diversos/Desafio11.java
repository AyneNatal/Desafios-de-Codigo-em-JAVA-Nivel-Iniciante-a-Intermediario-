package desafios.diversos;

/*
DESAFIO 11)

MATRIZES:
    1. Gere e imprima uma Matriz M 4x4 com valores aleatórios entre 0 e 100.
    2. Após isso determine o maior número da matriz e a sua posição (linha/coluna).
*/

import java.util.Arrays;
import java.util.Random;

public class Desafio11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz4x4 = new int[4][4];

        int linha = 0;
        int coluna = 0;
        int maiorNumeroDaMatriz = 0;

        for (int i = 0; i < matriz4x4.length; i++) {
            for (int j = 0; j < matriz4x4[i].length; j++) {
                matriz4x4[i][j] = random.nextInt(100) + 1; //gerando nums aleatorios e colocando dentro da matriz

                if (matriz4x4[i][j] > maiorNumeroDaMatriz) {
                    linha = i;
                    coluna = j;
                    maiorNumeroDaMatriz = matriz4x4[i][j];
                }
            }
        }

        System.out.println("Matriz: " + Arrays.deepToString(matriz4x4));  //conferindo a matriz gerada

        //resposta:
        System.out.printf("%nMaior num da matriz é o %d localizado na Linha %d e na Coluna %d", maiorNumeroDaMatriz, linha, coluna);
    }
}
