package desafios.codewars;

/*
DESAFIO CODEWARS -> Cat years, Dog years | 8 Kyu
Link para o desafio -> https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
*/

import java.util.Arrays;

public class Codewars20 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1))); // [1,15,15]
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2))); // [2,24,24]
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10))); // [10,56,64]
    }

    //RESOLUÇÃO:
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }

        return new int[]{humanYears,catYears,dogYears};
    }
}

/*
Atenção:
    Quando não há um comando indicando que o código deve ser interrompido (break ou ->),
    o switch faz a comparação de todos os cases sem exceção, independentemente se um deles for compatível ou não,
    por isso o cód da resolução passa por todos os cases após o case que bate com o switch.

    Por exemplo, quando humanYears = 2, vamos direto para o case 2 onde é executada a instrução e como não tem um break
    o cod passa para o prox bloco de instruções (que é o case 1) e executa tbm as instruções. Quando o humanYears é maior
    que 2, ele cai no case default então é executado o bloco de instrução dele e depois do case 2 e case 1.
*/
