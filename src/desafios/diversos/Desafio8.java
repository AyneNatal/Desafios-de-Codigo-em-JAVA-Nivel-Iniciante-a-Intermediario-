package desafios.diversos;

/*
DESAFIO 8) Treinando o uso da API Stream

Dada a lista:
    List<String> aleatoryNumbers = Arrays.asList("1","0","4","2","3","9","9","5","8");

Faça:
    1. Imprima os elementos dessa lista;
    2. Coloque os 5 primeiros elementos dentro de um Set;
    3. Transforme essa lista de Strings numa lista de números inteiros;
    4. Coloque os números pares e maiores que 2 em uma lista;
    5. Remova os valores ímpares.

*/

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio8 {
    public static void main(String[] args) {
        List<String> aleatoryNumbers = Arrays.asList("1","0","4","2","3","9","9","5","8");

        //1.
        aleatoryNumbers.forEach(System.out::println);

        //2.
        Set<String> cincoPrimeirosElementos = aleatoryNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println("cincoPrimeirosElementos = " + cincoPrimeirosElementos);

        //3.
        List<Integer> stringParaInteiro = aleatoryNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("stringParaInteiro = " + stringParaInteiro);

        //4.
        List<Integer> numerosParesMaioresQueDois = stringParaInteiro.stream()
                .filter(num -> num % 2 == 0 && num > 2)
                .collect(Collectors.toList());
        System.out.println("numerosParesMaioresQueDois = " + numerosParesMaioresQueDois);

        //5.
        stringParaInteiro.removeIf(num -> num % 2 != 0);
        System.out.println("Removendo os ímpares: " + stringParaInteiro);
    }
}
