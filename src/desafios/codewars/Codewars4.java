package desafios.codewars;

/*
DESAFIO CODEWARS -> Coloured Triangles | 7 Kyu
Link para o site -> https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111
*/

public class Codewars4 {

    //TESTES:
    public static void main(String[] args) {
        System.out.println("triangle(\"GB\") = " + triangle("GB")); // 'R'
        System.out.println("triangle(\"RBRGBRB\") = " + triangle("RBRGBRB")); // 'G'
    }

    //RESOLVENDO:
    public static char triangle(final String row) {
        if (row.length() == 1) return row.charAt(0);

        String nextRow = "";
        for (int i = 1; i < row.length(); i++) {
            char c1 = row.charAt(i - 1);
            char c2 = row.charAt(i);

            switch (c1) {
                case 'R' -> nextRow += c2 == 'R' ? 'R' : c2 == 'G' ? 'B' : 'G';
                case 'G' -> nextRow += c2 == 'R' ? 'B' : c2 == 'G' ? 'G' : 'R';
                case 'B' -> nextRow += c2 == 'R' ? 'G' : c2 == 'G' ? 'R' : 'B';
            }
        }
        return triangle(nextRow); //recursividade
    }
}
