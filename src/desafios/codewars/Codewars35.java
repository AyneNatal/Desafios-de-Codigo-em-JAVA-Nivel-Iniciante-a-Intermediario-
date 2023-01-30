package desafios.codewars;

/*
    DESAFIO CODEWARS -> Backspaces in string | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
*/

public class Codewars35 {
    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c")); //"ac"
        System.out.println(cleanString("abc##d######")); //""
    }

    public static String cleanString(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (builder.length() > 0) {
                    builder.deleteCharAt(builder.length() - 1);
                }
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

    /*
    OUTRA FORMA DE RESOLVER (COM REGEX):

    public String cleanString(String s) {

    while (s.matches(".*[^#]#.*")) s = s.replaceAll("[^#]#", "");
    return s.replaceAll("#","");

    }

    Explicando o REGEX:
    - O .* (ponto asterisco) significa zero ou mais caracteres qualquer.
    - O [^#]# significa qualquer caractere diferente de # seguido de #.

    */
}
