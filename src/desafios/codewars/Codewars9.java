package desafios.codewars;

/*
DESAFIO CODEWARS -> What is between? | 8 Kyu
Link para o site: https://www.codewars.com/kata/55ecd718f46fba02e5000029/java
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class Codewars9 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("between(1, 5) = " + Arrays.toString(between(1, 5)));
        System.out.println("between(10, 20) = " + Arrays.toString(between(10, 20)));
    }

    //RESOLUÇÃO:
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b).toArray();
    }

    /*
    OUTRA FORMA DE RESOLVER:

    public static int[] between(int a, int b) {
        int[] arr = new int[b - a + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + i;
        }
        return arr;
    }
    */
}
