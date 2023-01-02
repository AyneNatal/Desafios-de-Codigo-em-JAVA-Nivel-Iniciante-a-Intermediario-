package desafios.codewars;

/*
    DESAFIO CODEWARS -> Take a Ten Minutes Walk | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
*/

public class Codewars25 {
    //TESTANDO:
    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'})); // true
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'})); //false
        System.out.println(isValid(new char[]{'w'})); //false
    }

    //RESOLVENDO:
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0;
        int y = 0;

        for (char c : walk) {
            switch (c) {
                case 'n' -> x++;
                case 's' -> x--;
                case 'w' -> y++;
                case 'e' -> y--;
            }
        }

        return x == 0 && y == 0;
    }
}

/*
OBS:
A descrição do desafio é um pouco confusa, o que temos que fazer aqui é conferir se pro usuário do APP ir e voltar ele leva
exatamente 10 minutos (nem mais, nem menos), sendo que cada direção cardinal (letra do array de chars) leva 1 minuto pra ele percorrer.
A atenção aqui deve estar que pra fazer o caminho de volta as direções devem ser contrárias, por exemplo: Ele caminha nas seguintes
direções (n,n,w,s,e) então para ele voltar deve fazer o caminho de (s,s,e,n,w) e somando a ida e a volta deve ter examente 10 letras,
para assim darem os 10 minutos.

Direções Cardinais em inglês:
North / Norte = n
South / Sul = s
East / Leste = e
West / Oeste = w

*/