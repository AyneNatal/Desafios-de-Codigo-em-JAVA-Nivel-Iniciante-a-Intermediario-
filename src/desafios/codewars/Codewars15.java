package desafios.codewars;

/*
DESAFIO CODEWARS -> Equal Sides Of An Array | 6 Kyu
Link para o site -> https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
*/

import java.util.Arrays;

public class Codewars15 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("{1,2,3,4,3,2,1}) = " + findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1})); //3
        System.out.println("{1,100,50,-51,1,1}) = " + findEvenIndex(new int[]{1, 100, 50, -51, 1, 1})); //1
    }

    //RESOLUÇÃO:
    public static int findEvenIndex(int[] arr) {
        int leftSide = 0;
        int rightSide = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++){
            rightSide -= arr[i];
            if (leftSide == rightSide) return i;
            leftSide += arr[i];
        }
        return -1;
    }
}
