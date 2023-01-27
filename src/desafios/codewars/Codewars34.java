package desafios.codewars;

/*
    DESAFIO CODEWARS -> Persistent Bugger. | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
*/

import java.util.Arrays;

public class Codewars34 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println(persistence(39)); //3
        System.out.println(persistence(999)); //4
        System.out.println(persistence(4)); //0
    }

    //RESOLVENDO:
    public static int persistence(long n) {
        if (n < 10) return 0;
        int count = 0;

        while (n >= 10) {
            count++;
            n = Arrays.stream(Long.toString(n).split(""))
                    .map(Long::parseLong)
                    .reduce(1L, (a, b) -> a *= b);
        }

        return count;
    }
}
