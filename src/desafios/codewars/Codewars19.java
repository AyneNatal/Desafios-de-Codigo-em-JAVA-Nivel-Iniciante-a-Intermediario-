package desafios.codewars;

/*
DESAFIO CODEWARS -> Disemvowel Trolls | 7 Kyu
Link para o site -> https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
*/

public class Codewars19 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    //RESOLVENDO:
    public static String disemvowel(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }

}
    //da pra fazer o REGEX filtrando por caseInsensitive: str.replaceAll("(?i)[aeiou]", "")
