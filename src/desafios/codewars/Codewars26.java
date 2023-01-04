package desafios.codewars;

/*
    DESAFIO CODEWARS -> More Zeros than Ones | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/5d41e16d8bad42002208fe1a/train/java
*/

import java.util.Arrays;

public class Codewars26 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println("abcde = " + Arrays.toString(moreZeros("abcde"))); // ['a', 'b', 'd']
        System.out.println("aaabcde = " + Arrays.toString(moreZeros("aaabcde"))); // ['a', 'b', 'd']
        System.out.println("DIGEST = " + Arrays.toString(moreZeros("DIGEST"))); // ['D', 'I', 'E', 'T']
    }

    //RESOLVENDO:
    public static char[] moreZeros(String s) {
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            String binary = Integer.toBinaryString((int)c); //convertendo o char em int eu pego o valor ascii e converto em binario com toBinaryString().
            if (binary.charAt(0) == '0') binary = binary.substring(1); //O desafio diz que todos os zeros à esquerda NÃO devem ser contados.

            long countZeros = binary.chars().filter(i -> i == '0').count(); //contando os zeros.
            long countOnes = binary.chars().filter(i -> i == '1').count(); //contando os uns.

            if (countZeros > countOnes && !builder.toString().contains(String.valueOf(c))) { //verificando se a qnt de zeros é superior aos uns e se já não existe aquela mesma letra dentro de builder.
                builder.append(c);
            }
        }

        return builder.toString().toCharArray(); //retornando um arr de chars.
    }
}
