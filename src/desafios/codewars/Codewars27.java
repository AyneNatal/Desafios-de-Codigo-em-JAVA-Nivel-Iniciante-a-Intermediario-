package desafios.codewars;

/*
    DESAFIO CODEWARS -> If you can't sleep, just count sheep!! | 8 Kyu
    Link para o site -> https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
*/

public class Codewars27 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println("3 = " + countingSheep(3));
        System.out.println("10 = " + countingSheep(10));
    }

    //RESOLVENDO:
    public static String countingSheep(int num) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            builder.append(i).append(" sheep...");
        }

        return builder.toString();
    }
}
