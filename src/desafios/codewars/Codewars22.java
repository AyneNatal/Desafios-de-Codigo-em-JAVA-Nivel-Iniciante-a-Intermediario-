package desafios.codewars;

/*
DESAFIO CODEWARS -> Complementary DNA | 7 Kyu
Link para o site -> https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java
*/

public class Codewars22 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("ATTGC = " + makeComplement("ATTGC")); // "TAACG"
        System.out.println("GTAT = " + makeComplement("GTAT"));   // "CATA"
    }

    //RESOLVENDO:
    public static String makeComplement(String dna) {
        return dna.replace("A", "_")
                .replace("G", "+")
                .replace("T", "A")
                .replace("C", "G")
                .replace("_", "T")
                .replace("+", "C");
    }
}


