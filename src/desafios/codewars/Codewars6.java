package desafios.codewars;

/*
DESAFIO CODEWARS -> Print Errors | 7 Kyu
Link para o site -> https://www.codewars.com/kata/56541980fa08ab47a0000040
*/

public class Codewars6 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("printerError(\"aaaxbbbbyyhwawiwjjjwwm\") = " + printerError("aaaxbbbbyyhwawiwjjjwwm")); // "0/14"
        System.out.println("printerError(\"aaabbbbhaijjjm\") = " + printerError("aaabbbbhaijjjm")); // "8/22"
    }

    //RESOLVENDO:
    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

    /*
    OUTRAS FORMAS DE RESOLVER:

    public static String printerError(String s) {
        return s.chars().filter(c -> c > 'm').count() + "/" + s.length();
    }

    OU

    public static String printerError1(String s) {
        String[] letters = s.split("");
        int sumErros = 0;

        for (String letter : letters) {
            switch (letter) {
                case "n", "o", "p", "q", "r", "s", "t", "u", "v", "x","w","y","z" -> sumErros++;
            }
        }

        return sumErros + "/" + letters.length;
    }
    */
}
