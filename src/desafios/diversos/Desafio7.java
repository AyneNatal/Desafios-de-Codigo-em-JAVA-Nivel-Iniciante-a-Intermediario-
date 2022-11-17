package desafios.diversos;

/*
DESAFIO 7)

Dada a seguinte lista de inteiros:

    List<Integer> list = Arrays.asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6, null, null);

Retorne uma segunda lista com os inteiros que repetem a quantidade passada pelo parâmetro numberOfDuplicates.
Obs: Valores nulos não devem ser contados.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desafio7 {
    //TESTES:
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6, null, null);

        System.out.println("findDuplicates(list, 2) = " + findDuplicates(list, 2));
    }

    //RESOLVENDO:
    public static List<Integer> findDuplicates (List<Integer> integers, int numberOfDuplicates) {
        Map<Integer, Integer> contagemDosNumeros = new HashMap<>(); //Map para separar o num da quantidade de vezes q ele aparece

        for (Integer i : integers) {
            if (!contagemDosNumeros.containsKey(i)) {
                contagemDosNumeros.put(i, 1); //se o num não existir, coloque ele de chave e o 1 de valor
            } else {
                contagemDosNumeros.put(i, contagemDosNumeros.get(i) + 1); //se o num já existir como chave, some 1 ao valor.
            }
        }

        System.out.println("contagemDosNumeros = " + contagemDosNumeros); //assim temos um map com a relação num X quantidade

        List<Integer> resposta = new ArrayList<>(); //lista q vai receber os numeros repetidos segundo o parametro numberOfDuplicates

        for (Map.Entry<Integer,Integer> nums : contagemDosNumeros.entrySet()) {
            if (nums.getValue() == numberOfDuplicates) { //se o valor contido no map for igual ao numberOfDuplicates
                resposta.add(nums.getKey()); //adiciono o valor a lista final
                resposta.remove(null); //removo os valores nulos
            }
        }

        return resposta;
    }
}
