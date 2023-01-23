package desafios.codewars;

/*
    DESAFIO CODEWARS -> Mean Square Error | 5 Kyu
    Link para o site -> https://www.codewars.com/kata/51edd51599a189fe7f000015/solutions/java
*/

import java.util.ArrayList;
import java.util.List;

public class Codewars33 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, new int[]{4, 5, 6})); //9
        System.out.println(solution(new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2})); //16.5
    }

    //RESOLVENDO:
    public static double solution(int[] arr1, int[] arr2) {
        double result = 0;
        List<Integer> calc = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            calc.add((int) Math.pow(Math.abs(arr1[i] - arr2[i]),2));
            result += calc.get(i);
        }

        result = result/arr1.length;
        return result;
    }
}


//Regras do desafio:
//        1. aceita dois arrays inteiros de igual comprimento
//        2. compara o valor de cada membro em uma matriz com o membro correspondente na outra
//        3. eleva ao quadrado a diferença de valor absoluto entre esses dois valores
//        4. retorna a média dessa diferença de valor absoluto ao quadrado entre cada par de membros.
