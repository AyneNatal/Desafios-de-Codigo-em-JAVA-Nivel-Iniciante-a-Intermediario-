package desafios.codewars;

/*
    DESAFIO CODEWARS -> Car Number Plate Calculator | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/5f25f475420f1b002412bb1f/train/java
*/


public class Codewars23 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("3 = " + findTheNumberPlate(3)); // "aaa004"
        System.out.println("1487 = " + findTheNumberPlate(1487)); // "baa489"
        System.out.println("234567 = " + findTheNumberPlate(234567)); // "aja802"
    }

    //RESOLVENDO:
    public static String findTheNumberPlate(int customerID) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char c1 = alphabet.charAt(customerID / 999 % 26);
        char c2 = alphabet.charAt(customerID / 999 / 26 % 26);
        char c3 = alphabet.charAt(customerID / 999 / 26 / 26 % 26);

        return "" + c1 + c2 + c3 + String.format("%03d", customerID % 999 + 1);
    }
}

// Ty User rostslv