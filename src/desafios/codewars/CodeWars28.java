package desafios.codewars;

/*
    DESAFIO CODEWARS -> Beginner Series #3 Sum of Numbers | 7 Kyu
    Link para o site -> https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
*/

import java.util.stream.IntStream;

public class CodeWars28 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println("(-1,2) = " + GetSum(-1, 2)); //2
        System.out.println("(1,1) = " + GetSum(1, 1)); //1
        System.out.println("(3,1) = " + GetSum(3, 1)); //6
    }

    //RESOLVENDO:
    public static int GetSum(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }


    /*

    Outra Forma de resolver (com recursividade):

    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        else if (a > b) {
            return a + GetSum(a-1, b);
        } else {
            return a + GetSum (a+1, b);
        }
    }

     */
}
