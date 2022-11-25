package desafios.diversos;

/*
DESAFIO 10)
Chegue no resultado a seguir utilizando o loop For e sem utilizar valores numéricos:

#
##
###
#####

*/

public class Desafio10 {
    public static void main(String[] args) {
        for (String i = "#"; !i.equals("######")  ; i += "#") {
            System.out.println(i);
        }
    }
}
