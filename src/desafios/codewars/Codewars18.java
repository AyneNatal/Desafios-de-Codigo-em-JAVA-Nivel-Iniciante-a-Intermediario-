package desafios.codewars;

/*
DESAFIO CODEWARS -> altERnaTIng cAsE <=> ALTerNAtiNG CaSe | 8 Kyu
Link para o site -> https://www.codewars.com/kata/56efc695740d30f963000557/train/java
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Codewars18 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("(\"HeLLo WoRLD\") = " + toAlternativeString("HeLLo WoRLD")); //"hEllO wOrld"
        System.out.println("(\"1a2b3c4d5e\") = " + toAlternativeString("1a2b3c4d5e")); //"1A2B3C4D5E"
        System.out.println("(\"12345\") = " + toAlternativeString("12345")); //"12345"
    }

    //RESOLVENDO:
    public static String toAlternativeString(String string) {
        return Arrays.stream(string.split(""))
                .map(s -> s.equals(s.toUpperCase()) ? s.toLowerCase() : s.toUpperCase())
                .collect(Collectors.joining(""));
    }
}
