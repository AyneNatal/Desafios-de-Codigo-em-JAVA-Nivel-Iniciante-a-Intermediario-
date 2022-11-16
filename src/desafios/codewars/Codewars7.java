package desafios.codewars;

/*
DESAFIO CODEWARS -> If you can't sleep, just count sheep!! | 8 Kyu
Link para o site -> https://www.codewars.com/kata/5b077ebdaf15be5c7f000077
*/

public class Codewars7 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("countingSheep(3) = " + countingSheep(3));
        System.out.println("countingSheep(7) = " + countingSheep(7));
    }

    //RESOLUÇÃO:
    public static String countingSheep(int num) {
        StringBuilder murmur = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            murmur.append(i + " sheep...");
        }

        return murmur.toString();
    }
}
