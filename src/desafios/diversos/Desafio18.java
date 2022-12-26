package desafios.diversos;

/*
DESAFIO 18) classes, atributos e métodos

    Escreva uma classe que tem um atributo estático que é incrementado sempre que a classe for instanciada.
    Crie métodos para zerar e mostrar o valor do contador. Teste essa classe.

*/

public class Desafio18 {
    public static void main(String[] args) {
        Usuario.mostrarContador(); //espera-se 0

        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();
        Usuario user3 = new Usuario();

        Usuario.mostrarContador(); //espera-se 3
        Usuario.zerarContador(); //zerando o contador
        Usuario.mostrarContador(); //espera-se 0
    }
}

//Classe a ser Instanciada:
class Usuario {
    private static int contador;

    public Usuario() {
        contador++;
    }

    //método para zerar o contador
    public static void zerarContador() {
        contador = 0;
    }

    //método para mostrar o valor de contador
    public static void mostrarContador() {
        System.out.println(contador);
    }
}



//Exercício retirado do curso de JAVA da Loiane (https://loiane.training)
//Acesse o site, os cursos são gratuitos e ainda emitem certificado!