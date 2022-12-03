package desafios.diversos;

/*
DESAFIO 12)
    Crie um programa que receba uma palavra e imprime no console letra por letra.
*/

import java.util.Scanner;

public class Desafio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra;
        String[] palavraSeparada;

        System.out.print("Insira uma palavra: ");
        palavra = scan.nextLine();
        palavraSeparada = palavra.split("");

        for (String s : palavraSeparada) {
            System.out.println(s);
        }

        scan.close(); //lembre-se de fechar o Scanner
    }
}
