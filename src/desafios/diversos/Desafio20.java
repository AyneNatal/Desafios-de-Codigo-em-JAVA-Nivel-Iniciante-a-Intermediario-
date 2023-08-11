package desafios.diversos;

/*
    DESAFIO 20)

    Usando o método a seguir:
        public static String formataCodigo(int codigo, String caractere, int tamanhoTotal) {
            // cod here...
        }

    1. Implemente um programa que receba um codigo numerico e que retorne esse número com zeros preenchendo a esquerda do número até completar o tamanho de 10 caracteres.
        Ex: input: 1167, output: 0000001167
*/

public class Desafio20 {
    public static void main(String[] args) {
        //Testes:
        int codigo = 123;
        int codigo2 = 7654321;

        System.out.println(formataCodigo(codigo, "0", 10)); // out: 0000000123
        System.out.println(formataCodigo(codigo2, "0", 10)); // out: 0007654321
    }

    //Resolvendo:
    public static String formataCodigo(int codigo, String caractere, int tamanhoTotal) {
        String codigoEmStr = String.valueOf(codigo);
        return caractere.repeat(tamanhoTotal - codigoEmStr.length()) + codigoEmStr;
    }
}
