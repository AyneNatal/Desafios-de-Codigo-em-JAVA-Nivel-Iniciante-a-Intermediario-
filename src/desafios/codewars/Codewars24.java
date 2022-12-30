package desafios.codewars;

/*
    DESAFIO CODEWARS -> Remove the parentheses | 6 Kyu
    Link para o site -> https://www.codewars.com/kata/5f7c38eb54307c002a2b8cc8/train/java
*/

public class Codewars24 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("example(unwanted thing)example = " + removeParentheses("example(unwanted thing)example")); //exampleexample
        System.out.println("example (unwanted thing) example = " + removeParentheses("example (unwanted thing) example")); //example  example
        System.out.println("a(b(c)) = " + removeParentheses("a(b(c))")); //a
    }

    //RESOLVENDO:
    public static String removeParentheses(final String str) {
        String newString = str.replaceAll("\\([^()]*\\)", ""); //regex para remover os parenteses e seu conteúdo.
        if (newString.contains("(")) { //se após remover o primeiro conjunto de parenteses SE houver outros parenteses...
            newString = removeParentheses(newString); //...remova os parenteses novamente (recursividade para remover parenteses aninhados).
        }

        return newString;
    }
}



/*
    Entendendo o regex usado (segundo o ChatGPT =P):

    A expressão regular "\([^()]*\)" é usada para procurar por um par de parênteses e qualquer coisa entre eles. Ela é composta por três partes:

    "\(" - Uma barra invertida seguida de um parênteses, que procura por um parênteses de abertura. A barra invertida é usada para escapar o parênteses, pois ele tem um significado especial em expressões regulares.

    "[^()]*" - Uma classe de caracteres negados seguida de um asterisco. A classe de caracteres negados "[^()]" procura por qualquer caractere que não seja um parênteses de abertura ou fechamento. O asterisco indica que essa classe de caracteres pode aparecer zero ou mais vezes. Isso significa que a expressão regular procurará por qualquer coisa entre os parênteses, desde que não haja outros parênteses aninhados.

    "\)" - Uma barra invertida seguida de um parênteses, que procura por um parênteses de fechamento.

    Portanto, a expressão regular completa procura por um par de parênteses e qualquer coisa entre eles, mas não inclui outros parênteses aninhados.

*/