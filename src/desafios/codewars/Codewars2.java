package desafios.codewars;

/*

DESAFIO CODEWARS -> I love you, a little, a lot, passionately... not at all | 8 Kyu
Link do desafio no site: https://www.codewars.com/kata/57f24e6a18e9fad8eb000296

*/

import java.util.List;

public class Codewars2 {
    //TESTE:
    public static void main(String[] args) {
        System.out.println("howMuchILoveYou(20) = " + howMuchILoveYou(20));
        System.out.println("howMuchILoveYou(1) = " + howMuchILoveYou(1));
        System.out.println("howMuchILoveYou(48) = " + howMuchILoveYou(48));
    }

    public static String howMuchILoveYou(int nb_petals) {
        String[] petals = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};

        return petals[(nb_petals - 1) % petals.length] ;


        //OU (or)

//        return List.of("I love you", "a little", "a lot", "passionately", "madly", "not at all")
//                .get((nb_petals - 1) % 6);
    }
}
