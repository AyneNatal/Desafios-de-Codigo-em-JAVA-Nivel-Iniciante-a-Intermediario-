package desafios.codewars;

/*
    DESAFIO CODEWARS -> Sum of Digits / Digital Root | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
*/

import java.util.Arrays;

public class Codewars30 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println(digital_root(16)); //7
        System.out.println(digital_root(456)); //6
    }

    //RESOLVENDO:
    public static int digital_root(int n) {

        while (n >= 10){
            n = Arrays.stream(Integer.toString(n).split(""))
                    .map(Integer::parseInt)
                    .reduce(0, (a, b) -> a += b);
        }

        return n;
    }

    /*
    OUTRA FORMA DE RESOLVER:

        public static int digital_root(int n) {
            return (n != 0 && n % 9 == 0) ? 9 : n % 9;
        }

    */
}
