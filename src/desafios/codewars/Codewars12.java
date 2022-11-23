package desafios.codewars;

/*
DESAFIO CODEWARS -> To square(root) or not to square(root) | 8 Kyu
Link para o site -> https://www.codewars.com/kata/57f6ad55cca6e045d2000627/train/java
*/

import java.util.Arrays;

public class Codewars12 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("{4,3,9,7,2,1} = " + Arrays.toString(squareOrSquareRoot(new int[]{4, 3, 9, 7,
                2, 1})));
    }

    //RESOLUÇÃO:
    public static int[] squareOrSquareRoot(int[] array){
        return Arrays.stream(array)
                .map(num -> Math.sqrt(num) % 1 == 0 ? (int) Math.sqrt(num) : num * num).toArray();
    }
}


