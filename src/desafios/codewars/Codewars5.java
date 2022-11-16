package desafios.codewars;

/*
DESAFIO CODEWARS -> Build a Square
Link para o site -> https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/train/java
*/

public class Codewars5 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("generateShape(3) = " + generateShape(3));
        System.out.println("generateShape(5) = " + generateShape(5));
    }

    //RESOLUÇÃO:
    public static final String generateShape(int n) {
        return ("+".repeat(n)  + "\n").repeat(n).trim();
    }

    /*
    OUTRA FORMA DE RESOLVER:

    public static final String generateShape(int n) {
        StringBuilder square = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square.append("+");
            }
            square.append("\n");
        }

        return square.toString().trim();
    }
    */
}
