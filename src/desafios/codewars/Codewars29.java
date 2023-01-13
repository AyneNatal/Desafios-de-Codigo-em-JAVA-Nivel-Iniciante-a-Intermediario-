package desafios.codewars;

/*
    DESAFIO CODEWARS -> Find the unique number | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/585d7d5adb20cf33cb000235/solutions/java
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Codewars29 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1})); //2
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0})); //0.55
    }

    //RESOLVENDO:
    public static double findUniq(double arr[]) {
        Map<Double, Integer> count = new HashMap<>(); //Map para contar quantas vezes o valor aparece.
        double result = 0;

        for (double i : arr) {
            if (!count.containsKey(i)) {
                count.put(i, 1);
            } else {
                count.put(i, count.get(i) + 1);
            }
        }

        for (Map.Entry<Double, Integer> key : count.entrySet()) { //pegando somente o double que aparece uma vez
            if (key.getValue() == 1) result = key.getKey();
        }

        return result;
    }


    /*

    OUTRA FORMA DE RESOLVER:

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if(arr[0]==arr[1]) return arr[arr.length-1];
        else return arr[0];
    }

     */
}
