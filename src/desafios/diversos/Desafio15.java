package desafios.diversos;

/*
DESAFIO 15)

While / Do While
    Crie um programa que recebe 5 valores e ao final imprima o maior número.
    Obs: use a estrutura Do/While ou While para resolver.

*/

import java.util.Scanner;

public class Desafio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroUsuario;
        int maiorValor = 0;
        int contagem = 1;

        System.out.println("Insira 5 números para retornamos o maior valor:");
        do {
            System.out.printf("%d: ", contagem);
            numeroUsuario = scan.nextInt();

            if (numeroUsuario > maiorValor) maiorValor = numeroUsuario;

            contagem++;
        } while (contagem <= 5);

        System.out.printf("O maior número inserido é: %d", maiorValor);

    }
}
