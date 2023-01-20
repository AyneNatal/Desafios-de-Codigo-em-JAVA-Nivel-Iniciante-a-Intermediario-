package desafios.codewars;

/*
    DESAFIO CODEWARS -> RGB To Hex Conversion | 5 Kyu
    Link para o site -> https://www.codewars.com/kata/513e08acc600c94f01000001/train/java
*/

public class Codewars32 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255)); //FFFFFF
        System.out.println(rgb(255, 255, 300)); //FFFFFF
        System.out.println(rgb(148, 0, 211)); // 9400D3
        System.out.println(rgb(-20, 275, 125)); // 00FF7D
    }

    //RESOLVENDO:
    public static String rgb(int r, int g, int b) {
        r = r > 255 ? r = 255 : r < 0 ? r = 0 : r;
        g = g > 255 ? g = 255 : g < 0 ? g = 0 : g;
        b = b > 255 ? b = 255 : b < 0 ? b = 0 : b;

        return String.format("%02x%02x%02x",r,g,b).toUpperCase(); //O formato "%02x" é usado para garantir que o valor seja impresso com dois dígitos (com um 0 à esquerda se necessário)
    }
}
