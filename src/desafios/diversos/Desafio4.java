package desafios.diversos;

/*
DESAFIO 4)
Construir um programa que simule um JOGO DE ADIVINHAÇÃO (no console):
    1. O usuário deve tentar acertar um número de 1 a 100;
    2. O usuário tem 10 chances para acertar;
    3. O jogo deve informar se a tentativa foi acima ou abaixo do número correto;
    4. O jogo deve informar quantas tentativas o usuário ainda possui;
    5. Gere o número que o usuário deve acertar de forma randomica.
*/

import java.util.Random;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rdn = new Random();
        int numeroSorteado = rdn.nextInt(100) + 1;
        int tentativas = 10;
        System.out.println(numeroSorteado);

        System.out.printf("TENTE ADIVINHAR O NÚMERO DE 1 A 100, VOCÊ POSSUI %d CHANCES:%n", tentativas);
        for (int i = 1; i <= tentativas; i++) {
            int tentativaUsuario = scan.nextInt();

            if (tentativaUsuario == numeroSorteado) {
                System.out.printf("Parabéns! Você Acertou! O número era: %d%n", numeroSorteado);
                return;
            }
            else if (tentativaUsuario > numeroSorteado) {
                System.out.printf("Ops! Tente um número mais baixo! Você tem %d chances%n", (tentativas - i));
            }
            else {
                System.out.printf("Ops! Tente um número mais alto! Você tem %d chances%n", (tentativas - i));
            }
        }
    }
}
