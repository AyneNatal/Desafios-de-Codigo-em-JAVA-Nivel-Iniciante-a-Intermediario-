package desafios.codewars;

/*
    DESAFIO CODEWARS -> Sum of odd numbers | 7 Kyu
    Link para o site -> https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java
*/

public class Codewars31 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1)); //1
        System.out.println(rowSumOddNumbers(42)); //74088
        System.out.println(rowSumOddNumbers(6)); //216
    }

    //RESOLVENDO:
    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }
}

