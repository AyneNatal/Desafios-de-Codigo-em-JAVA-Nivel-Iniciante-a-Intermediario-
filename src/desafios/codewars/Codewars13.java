package desafios.codewars;

/*
DESAFIO CODEWARS -> Small enough-Beginner | 7 Kyu
Link para o desafio -> https://www.codewars.com/kata/57cc981a58da9e302a000214
*/

import java.util.Arrays;

public class Codewars13 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println(smallEnough(new int[]{1, 2, 3, 4, 5}, 10));
        System.out.println(smallEnough(new int[]{1, 20, 3, 4, 50}, 10));
    }

    //RESOLVENDO:
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a)
                .allMatch(num -> num <= limit);
    }
}
