package desafios.codewars;

/*
DESAFIO CODEWARS -> Jaden Casing Strings | 7 Kyu
Link para o site -> https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
*/

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Codewars16 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println(toJadenCase("testando... sera que vai funcionar?"));
        System.out.println(toJadenCase(""));
    }

    //RESOLUÇÃO:
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) return null;

        return Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
    }

    /*
    OUTRA FORMA DE RESOLVER:

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        char[] arr = phrase.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i - 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        return new String(arr);
    }

    */

}
