package desafios.codewars;

/*
DESAFIO CODEWARS -> Flatten and Sorter an array | 7 Kyu
Link para o site -> https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java
*/

import java.util.Arrays;

public class Codewars17 {
    //TESTES:
    public static void main(String[] args) {
        int[][] arr1 = new int[][] {{1,3,2,9}, {6,5,7}, {4,8}};

        System.out.println(Arrays.toString(flattenAndSort(arr1))); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    //RESOLVENDO:
    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
}
