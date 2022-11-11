package desafios.diversos;

/*
DESAFIO 2)
Dada a seguinte Lista:
List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

Faça:
    1. Converter os nums para uma string binária. Ex: 6 => "110".
    2. Inverter a string. Ex: "110" => "011".
    3. Converter de volta para um Inteiro. Ex: "011" => 3.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //1. Converter para uma String Binária:
        List<String> intToBinaryStr = nums.stream().map(Integer::toBinaryString).collect(Collectors.toList());
        System.out.println("intToBinaryStr = " + intToBinaryStr);

        //2. Inverter a string:
        List<String> invertedStr = intToBinaryStr.stream()
                .map(list -> new StringBuilder(list).reverse().toString()).collect(Collectors.toList());
        System.out.println("invertedStr = " + invertedStr);

        //3. Converter em um inteiro:
        List<Integer> strToInt = invertedStr.stream()
                .map(list -> Integer.parseInt(list, 2))
                .collect(Collectors.toList());
        System.out.println("strToInt = " + strToInt);
    }
}
