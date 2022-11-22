package desafios.codewars;

/*
DESAFIO CODEWARS -> Switcheroo | 7 Kyu
Link para o site -> https://www.codewars.com/kata/57f759bb664021a30300007d/train/java
*/

public class Codewars11 {
    public static void main(String[] args) {
        System.out.println("(\"acb\") = " + switcheroo("acb"));
        System.out.println("(\"aabacbaa\") = " + switcheroo("aabacbaa"));
    }

    //RESOLUÇÃO:
    public static String switcheroo(String x) {
        return x.replace('a', '_')
                .replace('b', 'a')
                .replace('_', 'b');
    }

    /*
    OUTRA FORMA DE RESOLVER:

    Lembrar dos imports:
    import java.util.Arrays;
    import java.util.stream.Collectors;

    public static String switcheroo(String x) {
        return Arrays.stream(x.split(""))
                .map(i -> {
                    if (i.equals("a")) {
                        i = i.replaceAll("[a]", "b");
                    }
                    else if (i.equals("b")) {
                        i = i.replaceAll("[b]", "a");
                    }
                    return i;
                })
                .collect(Collectors.joining());
    }

    */
}
