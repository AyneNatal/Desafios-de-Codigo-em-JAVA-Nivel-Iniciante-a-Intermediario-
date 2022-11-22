package desafios.codewars;

/*
DESAFIO CODEWARS -> Collatz Conjecture Length | 7 Kyu
Link para o site -> https://www.codewars.com/kata/54fb963d3fe32351f2000102/java
*/

public class Codewars10 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("conjecture(20) = " + conjecture(20));
    }

    //RESOLUÇÃO:
    public static long conjecture(long x) {
        long contador = 1;
        while (x != 1) {
            x = x % 2 == 0 ? x / 2 : x * 3 + 1;
            contador++;
        }
        return contador;
    }
}
