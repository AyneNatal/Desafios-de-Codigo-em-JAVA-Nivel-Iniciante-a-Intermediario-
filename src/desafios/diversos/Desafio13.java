package desafios.diversos;

/*
DESAFIO 13)

Trabalhando com Datas:
    1. Imprima no console a data de hoje utilizando a classe Calendar.
    2. Imprima no console a data de hoje utilizando a classe LocalDate.
*/

import java.time.LocalDate;
import java.util.Calendar;

public class Desafio13 {
    public static void main(String[] args) {
        //1.
        Calendar hoje1 = Calendar.getInstance();
        int dia1 = hoje1.get(Calendar.DAY_OF_MONTH);
        int mes1 = hoje1.get((Calendar.MONTH));
        int ano1 = hoje1.get(Calendar.YEAR);

        System.out.printf("Classe Calendar: %d/%d/%d%n", dia1, mes1, ano1);

        //2.
        LocalDate hoje2 = LocalDate.now();
        System.out.println("Classe LocalDate: " + hoje2);
    }
}
