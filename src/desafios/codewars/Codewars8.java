package desafios.codewars;

/*
DESAFIO CODEWARS -> Convert number to reversed array of digits | 8 Kyu
Link para o site -> https://www.codewars.com/kata/5583090cbe83f4fd8c000051
*/

import java.util.Arrays;

public class Codewars8 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("digitize(12345) = " + Arrays.toString(digitize(12345))); // [5, 4, 3, 2, 1]
        System.out.println("digitize(348597) = " + Arrays.toString(digitize(348597)));// [7, 9, 5, 8, 4, 3]
    }

    //RESOLUÇÃO
    public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    /*
    OUTRA FORMA DE RESOLVER:

    public static int[] digitize(long n) {
        String[] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            array[i] = Integer.parseInt(nums[i]);
        }

        return array;
    }

    */
}
