package desafios.codewars;

/*
CODEWARS -> FOUR/SEVEN | 7KYU
Link para o desafio: https://www.codewars.com/kata/5ff50f64c0afc50008861bf0/java
*/

import java.util.Map;

public class Codewars1 {
    public static void main(String[] args) {
        //TESTES:
        System.out.println("fourSeven(4) = " + fourSeven(4));
        System.out.println("fourSeven(7) = " + fourSeven(7));
        System.out.println("fourSeven(10) = " + fourSeven(10));
    }

    //RESOLUÇÃO:
    public static int fourSeven(int n){
        return Map.of(4,7,7,4).getOrDefault(n, 0);
    }

    //EXPLICAÇÃO:
    /*
    O método Map.of(key1,value1,key2,value2...) uma sequência de conjuntos de CHAVE (key) e VALOR (value)
    O método getOrDefault(key, defaultValue) é usado para obter o valor através de sua chave, se nenhum valor for mapeado com a chave fornecida, o valor padrão (defaultValue) é retornado.
    */
}
