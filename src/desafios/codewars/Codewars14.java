package desafios.codewars;

/*
DESAFIO CODEWARS -> Multiples of 3 or 5 | 6 Kyu
Link para o site -> https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
*/

import java.util.stream.IntStream;

public class Codewars14 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("solution(10) = " + solution(10)); //23
        System.out.println("solution(-3) = " + solution(-3)); //0
    }

    //RESOLUÇÃO:
    public static int solution(int number) {
        return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
    }
}

/*
    OUTRA FORMA DE RESOLVER:

    public static int solution(int number) {
        int sum = 0;

        for (int i = 3; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
*/
