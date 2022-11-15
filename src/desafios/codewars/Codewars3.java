package desafios.codewars;

/*
DESAFIO CODEWARS -> Mumbling | 7 Kyu
Link para o site ->  https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
*/

import java.util.Locale;

public class Codewars3 {
    //Testes:
    public static void main(String[] args) {
        System.out.println("accum(\"abcd\") = " + accum("abcd")); // "A-Bb-Ccc-Dddd"
        System.out.println("accum(\"RqaEzty\") = " + accum("RqaEzty")); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    }

    //Resolvendo:
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        char[] stringToChar = s.toCharArray();

        for (int i = 0; i < stringToChar.length; i++) {
            if (i > 0) sb.append('-');
            sb.append(Character.toUpperCase(stringToChar[i]));

            for (int j = 0; j < i; j++) {
                sb.append(Character.toLowerCase(stringToChar[i]));
            }
        }

        return sb.toString();
    }
}

//DICA: Debugue o loop for para entender melhor.
